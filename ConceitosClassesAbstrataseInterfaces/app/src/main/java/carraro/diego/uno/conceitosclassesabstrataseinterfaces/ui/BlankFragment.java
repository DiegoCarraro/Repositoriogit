package carraro.diego.uno.conceitosclassesabstrataseinterfaces.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import carraro.diego.uno.conceitosclassesabstrataseinterfaces.R;


public class BlankFragment extends Fragment {



    public BlankFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View layoutFragment = inflater.inflate(R.layout.fragment_blank,container,false);

       return layoutFragment;
    }
}