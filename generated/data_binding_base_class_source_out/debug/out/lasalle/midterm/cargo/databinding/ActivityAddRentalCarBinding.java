// Generated by view binder compiler. Do not edit!
package lasalle.midterm.cargo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import lasalle.midterm.cargo.R;

public final class ActivityAddRentalCarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout btn;

  @NonNull
  public final Button btnBrowse;

  @NonNull
  public final Button btnDelete;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final Button btnUpload;

  @NonNull
  public final ImageView imgCar;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final EditText txtCarId;

  @NonNull
  public final EditText txtModel;

  @NonNull
  public final EditText txtModelYear;

  private ActivityAddRentalCarBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout btn, @NonNull Button btnBrowse, @NonNull Button btnDelete,
      @NonNull Button btnSave, @NonNull Button btnUpload, @NonNull ImageView imgCar,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull EditText txtCarId, @NonNull EditText txtModel, @NonNull EditText txtModelYear) {
    this.rootView = rootView;
    this.btn = btn;
    this.btnBrowse = btnBrowse;
    this.btnDelete = btnDelete;
    this.btnSave = btnSave;
    this.btnUpload = btnUpload;
    this.imgCar = imgCar;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.txtCarId = txtCarId;
    this.txtModel = txtModel;
    this.txtModelYear = txtModelYear;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddRentalCarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddRentalCarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_rental_car, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddRentalCarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout btn = (ConstraintLayout) rootView;

      id = R.id.btnBrowse;
      Button btnBrowse = ViewBindings.findChildViewById(rootView, id);
      if (btnBrowse == null) {
        break missingId;
      }

      id = R.id.btnDelete;
      Button btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btnSave;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.btnUpload;
      Button btnUpload = ViewBindings.findChildViewById(rootView, id);
      if (btnUpload == null) {
        break missingId;
      }

      id = R.id.imgCar;
      ImageView imgCar = ViewBindings.findChildViewById(rootView, id);
      if (imgCar == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.txtCarId;
      EditText txtCarId = ViewBindings.findChildViewById(rootView, id);
      if (txtCarId == null) {
        break missingId;
      }

      id = R.id.txtModel;
      EditText txtModel = ViewBindings.findChildViewById(rootView, id);
      if (txtModel == null) {
        break missingId;
      }

      id = R.id.txtModelYear;
      EditText txtModelYear = ViewBindings.findChildViewById(rootView, id);
      if (txtModelYear == null) {
        break missingId;
      }

      return new ActivityAddRentalCarBinding((ConstraintLayout) rootView, btn, btnBrowse, btnDelete,
          btnSave, btnUpload, imgCar, textView3, textView4, textView5, txtCarId, txtModel,
          txtModelYear);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}