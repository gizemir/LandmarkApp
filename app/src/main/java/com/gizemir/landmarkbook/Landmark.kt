package com.gizemir.landmarkbook

import java.io.Serializable
//serilizable dediğimizde landmark etiketini kullanıp veri koyabiliyoruz. üç değişkene birden
class Landmark(val name:String, val country:String, val image:Int ): Serializable{

}