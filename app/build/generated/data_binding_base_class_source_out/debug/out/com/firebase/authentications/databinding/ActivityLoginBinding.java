// Generated by view binder compiler. Do not edit!
package com.firebase.authentications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.firebase.authentications.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnForgotPassword;

  @NonNull
  public final MaterialButton btnLogin;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final Button btnResendVerification;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final ConstraintLayout main;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnForgotPassword, @NonNull MaterialButton btnLogin,
      @NonNull Button btnRegister, @NonNull Button btnResendVerification, @NonNull EditText etEmail,
      @NonNull EditText etPassword, @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.btnForgotPassword = btnForgotPassword;
    this.btnLogin = btnLogin;
    this.btnRegister = btnRegister;
    this.btnResendVerification = btnResendVerification;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_forgotPassword;
      Button btnForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (btnForgotPassword == null) {
        break missingId;
      }

      id = R.id.btn_login;
      MaterialButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btn_register;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.btn_resend_verification;
      Button btnResendVerification = ViewBindings.findChildViewById(rootView, id);
      if (btnResendVerification == null) {
        break missingId;
      }

      id = R.id.et_email;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_password;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnForgotPassword, btnLogin,
          btnRegister, btnResendVerification, etEmail, etPassword, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
