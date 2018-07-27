package com.pt.khanh.demomvp.presenter.login;

import com.pt.khanh.demomvp.view.login.ViewHandleLogIn;

public class PresenterHandleLogIn implements PresenterImplHandleLogIn{
    private ViewHandleLogIn viewHandleLogIn;
    public PresenterHandleLogIn(ViewHandleLogIn viewHandleLogIn){
        this.viewHandleLogIn = viewHandleLogIn;
    }

    @Override
    public void CheckLogin(String username, String password) {
        //gọi tới model lấy data
        if(username.equals("") || password.equals("")){
            viewHandleLogIn.CheckInput();
        }
        else if(username.equals("khanh") && password.equals("123")){
            //return view đăng nhập thành công
            viewHandleLogIn.LogInSuccess();
        }
        else{
            //return view đăng nhập thất bại
            viewHandleLogIn.LogInEror();
        }
    }
}
