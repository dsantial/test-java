package scala

import java.text.SimpleDateFormat
import java.util.Calendar

/**
  * Created by danny on 2017/7/30.
  */
object testTime {

  def getYMDHMS(time1:String,diff:Int):String={
    //Set the time format
    val format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
    //Get the instance of calendar
    val calendarInstance = Calendar.getInstance()
     val t1= format1.parse(time1)

    calendarInstance.setTime(t1)
    calendarInstance.add(Calendar.YEAR, diff) //日期年加diff年
    calendarInstance.add(Calendar.MONTH, diff) //日期月加diff月
    calendarInstance.add(Calendar.DAY_OF_YEAR, diff)//日期日加diff天
    calendarInstance.add(Calendar.HOUR_OF_DAY,diff)//日期加diff小时
    calendarInstance.add(Calendar.MINUTE,diff)//日期加diff分钟
    calendarInstance.add(Calendar.SECOND,diff)//日期加diff秒
    val t11 = calendarInstance.getTime;
    val sm2 =format1.format(t11)
    sm2.toString

  }

  def main(args: Array[String]): Unit = {
    val st="2017-12-03 01:12:23"
//    val tt=getYMDHMS(st,-5)
    println(st)
     val calendarInstance = Calendar.getInstance()
    calendarInstance.set(2017,6,27,12,13,17)
    val t11 = calendarInstance.getTime;

    println(t11)
  }

}
