// Generated by view binder compiler. Do not edit!
package com.example.tesourosartsticos.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tesourosartsticos.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdicionarFigurinhaBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button button6;

  @NonNull
  public final EditText editAuthor;

  @NonNull
  public final EditText editDescription;

  @NonNull
  public final EditText editTitle;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button inputImage;

  @NonNull
  public final TextView textView;

  private FragmentAdicionarFigurinhaBinding(@NonNull FrameLayout rootView, @NonNull Button button6,
      @NonNull EditText editAuthor, @NonNull EditText editDescription, @NonNull EditText editTitle,
      @NonNull ImageView imageView, @NonNull Button inputImage, @NonNull TextView textView) {
    this.rootView = rootView;
    this.button6 = button6;
    this.editAuthor = editAuthor;
    this.editDescription = editDescription;
    this.editTitle = editTitle;
    this.imageView = imageView;
    this.inputImage = inputImage;
    this.textView = textView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdicionarFigurinhaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdicionarFigurinhaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_adicionar_figurinha, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdicionarFigurinhaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.editAuthor;
      EditText editAuthor = ViewBindings.findChildViewById(rootView, id);
      if (editAuthor == null) {
        break missingId;
      }

      id = R.id.editDescription;
      EditText editDescription = ViewBindings.findChildViewById(rootView, id);
      if (editDescription == null) {
        break missingId;
      }

      id = R.id.editTitle;
      EditText editTitle = ViewBindings.findChildViewById(rootView, id);
      if (editTitle == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.inputImage;
      Button inputImage = ViewBindings.findChildViewById(rootView, id);
      if (inputImage == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentAdicionarFigurinhaBinding((FrameLayout) rootView, button6, editAuthor,
          editDescription, editTitle, imageView, inputImage, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
