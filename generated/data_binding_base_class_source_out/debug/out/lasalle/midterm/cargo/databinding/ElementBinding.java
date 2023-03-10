// Generated by view binder compiler. Do not edit!
package lasalle.midterm.cargo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ElementBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView elementId;

  @NonNull
  public final TextView elementModel;

  @NonNull
  public final TextView elementModelYear;

  @NonNull
  public final ImageView elementPhoto;

  private ElementBinding(@NonNull ConstraintLayout rootView, @NonNull TextView elementId,
      @NonNull TextView elementModel, @NonNull TextView elementModelYear,
      @NonNull ImageView elementPhoto) {
    this.rootView = rootView;
    this.elementId = elementId;
    this.elementModel = elementModel;
    this.elementModelYear = elementModelYear;
    this.elementPhoto = elementPhoto;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ElementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ElementBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.element, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ElementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.elementId;
      TextView elementId = ViewBindings.findChildViewById(rootView, id);
      if (elementId == null) {
        break missingId;
      }

      id = R.id.elementModel;
      TextView elementModel = ViewBindings.findChildViewById(rootView, id);
      if (elementModel == null) {
        break missingId;
      }

      id = R.id.elementModelYear;
      TextView elementModelYear = ViewBindings.findChildViewById(rootView, id);
      if (elementModelYear == null) {
        break missingId;
      }

      id = R.id.elementPhoto;
      ImageView elementPhoto = ViewBindings.findChildViewById(rootView, id);
      if (elementPhoto == null) {
        break missingId;
      }

      return new ElementBinding((ConstraintLayout) rootView, elementId, elementModel,
          elementModelYear, elementPhoto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
