package com.codefox421.applevels;

import com.actionbarsherlock.app.SherlockFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentInstructions extends SherlockFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//Log.d("AppLevels:" + this.getClass().getSimpleName(), "onCreateView");
		return inflater.inflate(R.layout.instructions, container, false);
	}
	
}