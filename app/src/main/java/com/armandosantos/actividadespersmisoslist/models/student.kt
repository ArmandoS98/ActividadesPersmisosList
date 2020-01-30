package com.armandosantos.actividadespersmisoslist.models

import android.os.Parcel
import android.os.Parcelable

//Parcel es un contenedor para un mensaje
//puede ser usado para mandar un objeto serializado a travez de intent
//tiene mejor rendimiento que Serializer.
data class Student(
    var name: String,
    var lastName: String,
    var age: Int,
    var isDeveloper: Boolean = true
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readByte() != 0.toByte()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        //Tenemos que escribir los valores en el mismo orden ene l que leemos en el constructor
        parcel.writeString(name)
        parcel.writeString(lastName)
        parcel.writeInt(age)
        parcel.writeByte(if (isDeveloper) 1 else 0)
    }

    //Describe el tipo de contenido del objeto arvelable
    // 0 siempre se usa, el otro valo es 1 o CONTENTS_FILE_DESCRIPTOR, para tipos de objetos que implementan un File Descriptor
    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Student> {
        //Esto creara el objeto desde el parcel llmando al contructo SECUNDARIO
        override fun createFromParcel(parcel: Parcel) = Student(parcel)

        // Esto ayudara a serializar array de objetos del mismot tipo de esta class (Student)
        override fun newArray(size: Int) = arrayOfNulls<Student?>(size)
    }
}