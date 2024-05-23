// Generated by view binder compiler. Do not edit!
package com.example.tesourosartsticos.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tesourosartsticos.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdicionarQuizBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnCriar;

  @NonNull
  public final Button btnVoltar;

  @NonNull
  public final EditText opCorreta;

  @NonNull
  public final EditText opErradaDois;

  @NonNull
  public final EditText opErradaTres;

  @NonNull
  public final EditText opErradaUm;

  @NonNull
  public final EditText perguntaQuiz;

  private FragmentAdicionarQuizBinding(@NonNull FrameLayout rootView, @NonNull Button btnCriar,
      @NonNull Button btnVoltar, @NonNull EditText opCorreta, @NonNull EditText opErradaDois,
      @NonNull EditText opErradaTres, @NonNull EditText opErradaUm,
      @NonNull EditText perguntaQuiz) {
    this.rootView = rootView;
    this.btnCriar = btnCriar;
    this.btnVoltar = btnVoltar;
    this.opCorreta = opCorreta;
    this.opErradaDois = opErradaDois;
    this.opErradaTres = opErradaTres;
    this.opErradaUm = opErradaUm;
    this.perguntaQuiz = perguntaQuiz;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdicionarQuizBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdicionarQuizBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_adicionar_quiz, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdicionarQuizBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCriar;
      Button btnCriar = ViewBindings.findChildViewById(rootView, id);
      if (btnCriar == null) {
        break missingId;
      }

      id = R.id.btnVoltar;
      Button btnVoltar = ViewBindings.findChildViewById(rootView, id);
      if (btnVoltar == null) {
        break missingId;
      }

      id = R.id.opCorreta;
      EditText opCorreta = ViewBindings.findChildViewById(rootView, id);
      if (opCorreta == null) {
        break missingId;
      }

      id = R.id.opErradaDois;
      EditText opErradaDois = ViewBindings.findChildViewById(rootView, id);
      if (opErradaDois == null) {
        break missingId;
      }

      id = R.id.opErradaTres;
      EditText opErradaTres = ViewBindings.findChildViewById(rootView, id);
      if (opErradaTres == null) {
        break missingId;
      }

      id = R.id.opErradaUm;
      EditText opErradaUm = ViewBindings.findChildViewById(rootView, id);
      if (opErradaUm == null) {
        break missingId;
      }

      id = R.id.perguntaQuiz;
      EditText perguntaQuiz = ViewBindings.findChildViewById(rootView, id);
      if (perguntaQuiz == null) {
        break missingId;
      }

      return new FragmentAdicionarQuizBinding((FrameLayout) rootView, btnCriar, btnVoltar,
          opCorreta, opErradaDois, opErradaTres, opErradaUm, perguntaQuiz);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
