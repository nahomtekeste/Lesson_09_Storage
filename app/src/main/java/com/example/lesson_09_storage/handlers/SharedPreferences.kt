package com.example.lesson_09_storage.handlers

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(val context: Context) {

    private val PREFERANCES_NAME = "androidpref"

    val sharedPref: SharedPreferences? =
        context.getSharedPreferences(PREFERANCES_NAME,
            Context.MODE_PRIVATE)

    //String
    fun save(KEY_NAME: String, value: String){
        val editor:SharedPreferences.Editor =
                sharedPref!!.edit()
        editor.putString(KEY_NAME, value)
        editor.commit()
    }

    //Int
    fun save(KEY_NAME: String, value: Int){
        val editor:SharedPreferences.Editor =
            sharedPref!!.edit()
        editor.putInt(KEY_NAME, value)
        editor.commit()
    }

    //Boolean
    fun save(KEY_NAME: String, value: Boolean){
        val editor:SharedPreferences.Editor =
            sharedPref!!.edit()
        editor.putBoolean(KEY_NAME, value)
        editor.commit()
    }

    //Retrieve String
    fun getString(KEY_NAME: String):String?{
        return sharedPref?.getString(KEY_NAME,
            null)
    }

    //Retrieve Int
    fun getInt(KEY_NAME: String): Int{
        return sharedPref!!.getInt(KEY_NAME,
            0)
    }

    //Retrieve Boolean
    fun getBool(KEY_NAME: String): Boolean{
        return sharedPref!!.getBoolean(KEY_NAME,
            false)
    }

    //Delete
    fun delete(KEY_NAME: String){
        val editor: SharedPreferences.Editor =
                sharedPref!!.edit()
        editor.remove(KEY_NAME)
        editor.commit()
    }

    //Delete all
    fun clear(){
        val editor: SharedPreferences.Editor =
            sharedPref!!.edit()
        editor.clear()
        editor.commit()
    }
}

















