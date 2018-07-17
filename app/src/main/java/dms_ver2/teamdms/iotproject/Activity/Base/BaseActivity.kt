package dms_ver2.teamdms.iotproject.Activity.Base

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

open class BaseActivity : AppCompatActivity() {

    fun makeToast (context: Context, data : String) {
        Toast.makeText(context, data, Toast.LENGTH_SHORT).show()
    }
}