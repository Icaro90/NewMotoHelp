package com.example.icaro.newmotohelp.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.icaro.newmotohelp.Especialista.Moto;
import com.example.icaro.newmotohelp.R;
import com.example.icaro.newmotohelp.Tipos.*;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RespostaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RespostaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RespostaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private static Moto moto;

    private OnFragmentInteractionListener mListener;

    public RespostaFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static RespostaFragment newInstance(String param1, String param2 , Moto moto) {
        RespostaFragment fragment = new RespostaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        RespostaFragment.moto = moto;

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Insere a imagem selecionada
        View v = inflater.inflate(R.layout.fragment_perguntas, container, false);
        ImageView image =  (ImageView) v.findViewById(R.id.imageView);

        //image.setImageResource(moto.getImagem());
        image.setImageResource(R.drawable.titan1);
        //Insere a imagem selecionada

        return inflater.inflate(R.layout.fragment_resposta, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
