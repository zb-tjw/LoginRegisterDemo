package bzu.zb_tjw.loginregisterdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import bzu.zb_tjw.loginregisterdemo.utils.ClearEditText;
import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ClearEditText user;
    private ClearEditText pwd;
    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        user = (ClearEditText) findViewById(R.id.user);
        pwd = (ClearEditText) findViewById(R.id.pwd);
        register = (Button) findViewById(R.id.register);
        login = (Button) findViewById(R.id.login);

        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register:
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.login:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String userString = user.getText().toString().trim();
        if (TextUtils.isEmpty(userString)) {
            Toasty.info(this,"输入用户名",Toasty.LENGTH_SHORT).show();
            user.requestFocus();
            ((ClearEditText) user).setShakeAnimation();
            return;
        }

        String pwdString = pwd.getText().toString().trim();
        if (TextUtils.isEmpty(pwdString)) {
            Toasty.info(this,"输入密码",Toasty.LENGTH_SHORT).show();
            pwd.requestFocus();
            ((ClearEditText) pwd).setShakeAnimation();
            return;
        }

        Toasty.info(this,"实现登录逻辑",Toasty.LENGTH_SHORT).show();

        // TODO validate success, do something


    }
}
