package org.asghari.guardiannews.presentation.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import org.asghari.guardiannews.R;

public class HomePageFragmentDirections {
  private HomePageFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomePageFragmentToNewsDetailesPageFragment() {
    return new ActionOnlyNavDirections(R.id.action_homePageFragment_to_newsDetailesPageFragment);
  }
}
