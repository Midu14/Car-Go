// Generated by view binder compiler. Do not edit!
package lasalle.midterm.cargo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityAddRentalsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSaveRental;

  @NonNull
  public final Button btnToAllCars;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final EditText txtEndDate;

  @NonNull
  public final EditText txtStartDate;

  private ActivityAddRentalsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnSaveRental, @NonNull Button btnToAllCars, @NonNull TextView textView6,
      @NonNull TextView textView7, @NonNull TextView textView8, @NonNull EditText txtEndDate,
      @NonNull EditText txtStartDate) {
    this.rootView = rootView;
    this.btnSaveRental = btnSaveRental;
    this.btnToAllCars = btnToAllCars;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.txtEndDate = txtEndDate;
    this.txtStartDate = txtStartDate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddRentalsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddRentalsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_rentals, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddRentalsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSaveRental;
      Button btnSaveRental = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveRental == null) {
        break missingId;
      }

      id = R.id.btnToAllCars;
      Button btnToAllCars = ViewBindings.findChildViewById(rootView, id);
      if (btnToAllCars == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.txtEndDate;
      EditText txtEndDate = ViewBindings.findChildViewById(rootView, id);
      if (txtEndDate == null) {
        break missingId;
      }

      id = R.id.txtStartDate;
      EditText txtStartDate = ViewBindings.findChildViewById(rootView, id);
      if (txtStartDate == null) {
        break missingId;
      }

      return new ActivityAddRentalsBinding((ConstraintLayout) rootView, btnSaveRental, btnToAllCars,
          textView6, textView7, textView8, txtEndDate, txtStartDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
