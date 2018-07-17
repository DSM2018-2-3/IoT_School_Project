package dms_ver2.teamdms.iotproject.Activity.Activity

import android.content.Intent
import android.os.Bundle
import dms_ver2.teamdms.iotproject.Activity.Base.BaseActivity
import dms_ver2.teamdms.iotproject.R
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        bt_main_login.setOnClickListener {v ->
            makeToast(baseContext, "로그인이당 ㅎㅎㅎ")
        }

        bt_main_signup.setOnClickListener {v ->
            makeToast(baseContext, "회원가입이당 ㅎㅎㅎ")
            baseContext.startActivity(Intent(applicationContext, SignupActivity::class.java))
        }
    }
}