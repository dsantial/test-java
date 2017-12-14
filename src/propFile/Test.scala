package propFile

import java.io.{BufferedReader, File, FileInputStream, InputStreamReader}
import java.util.Properties

import scala.io.Source
/**
  * Created by 390767 on 17-12-14.
  */
object Test {

  def main(args: Array[String]): Unit = {

println(readProFile("中国"))

  }

  def getValue(key:String):String={

    val prop=new Properties()
    val url =getClass.getResource("/conf.properties")
    val source=Source.fromURL(url)
    prop.load(source.bufferedReader())
    prop.getProperty(key)

  }
  def getProp(key:String):String={
    val properties=new Properties()
    val in=getClass.getClassLoader.getResourceAsStream("conf.properties")//绝对路径，
    properties.load(new InputStreamReader(in,"utf-8"))
    properties.getProperty(key)
  }
  def readProFile(key:String):String={

    val filePath:String=System.getProperty("user.dir")+"/conf.properties"
    val props=new Properties()
    val inputStream=new FileInputStream(filePath)
    val bf=new BufferedReader(new InputStreamReader(inputStream,"utf-8"))
    props.load(bf)
    props.getProperty(key)

  }
  def getRootFileFirstThenResourceFile(key:String):String={

    val filePath=System.getProperty("user.dir")+"/conf.properties"
    val configFile=new File(filePath)

    val result= if (configFile.exists()){
      readProFile(key)
    }else{
      getValue(key)
    }
    result
  }

}
