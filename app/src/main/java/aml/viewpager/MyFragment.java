package aml.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragment extends Fragment {

public static  final  String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    public static final  MyFragment newInstance(String message) {
        MyFragment fragment = new MyFragment();
        Bundle bd1 = new Bundle(1);

        bd1.putString(EXTRA_MESSAGE , message);
        fragment.setArguments(bd1);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view =  inflater.inflate(R.layout.fragment_my, container, false);
        String message = getArguments().getString(EXTRA_MESSAGE);
        TextView messageTextView = view.findViewById(R.id.textView);


        messageTextView.setText(message);
        return  view ;
    }


}
