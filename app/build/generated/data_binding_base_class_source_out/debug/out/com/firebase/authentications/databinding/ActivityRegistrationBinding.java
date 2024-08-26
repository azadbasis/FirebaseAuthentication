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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistrationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText etConfirmPassword;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etPhone;

  @NonNull
  public final ConstraintLayout main;

  private ActivityRegistrationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnRegister, @NonNull EditText etConfirmPassword, @NonNull EditText etEmail,
      @NonNull EditText etName, @NonNull EditText etPassword, @NonNull EditText etPhone,
      @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.etConfirmPassword = etConfirmPassword;
    this.etEmail = etEmail;
    this.etName = etName;
    this.etPassword = etPassword;
    this.etPhone = etPhone;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.et_confirm_password;
      EditText etConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (etConfirmPassword == null) {
        break missingId;
      }

      id = R.id.et_email;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_name;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.et_password;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.et_phone;
      EditText etPhone = ViewBindings.findChildViewById(rootView, id);
      if (etPhone == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      return new ActivityRegistrationBinding((ConstraintLayout) rootView, btnRegister,
          etConfirmPassword, etEmail, etName, etPassword, etPhone, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
