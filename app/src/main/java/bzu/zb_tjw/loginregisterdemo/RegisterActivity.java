package bzu.zb_tjw.loginregisterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import bzu.zb_tjw.loginregisterdemo.utils.ClearEditText;
import es.dmoral.toasty.Toasty;

public class RegisterActivity extends AppCompatActivity {

    private ClearEditText username;
    private ClearEditText password;
    private ClearEditText confirm_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        username = (ClearEditText) findViewById(R.id.username);
        password = (ClearEditText) findViewById(R.id.password);
        confirm_password = (ClearEditText) findViewById(R.id.confirm_password);
    }

    public void submit(View view) {
        // validate
        String usernameString = username.getText().toString().trim();
        if (TextUtils.isEmpty(usernameString)) {
            Toasty.info(this,"输入用户名",Toasty.LENGTH_SHORT).show();
            username.requestFocus();
            ((ClearEditText) username).setShakeAnimation();
            return;
        }

        String passwordString = password.getText().toString().trim();
        if (TextUtils.isEmpty(passwordString)) {
            Toasty.info(this,"输入密码",Toasty.LENGTH_SHORT).show();
            password.requestFocus();
            ((ClearEditText) password).setShakeAnimation();
            return;
        }

        String password = confirm_password.getText().toString().trim();
        if (TextUtils.isEmpty(password)) {
            Toasty.info(this,"确认密码",Toasty.LENGTH_SHORT).show();
            confirm_password.requestFocus();
            ((ClearEditText) confirm_password).setShakeAnimation();
            return;
        }

        // TODO validate success, do something
        Toasty.info(this,"实现注册逻辑",Toasty.LENGTH_SHORT).show();
    }
}
