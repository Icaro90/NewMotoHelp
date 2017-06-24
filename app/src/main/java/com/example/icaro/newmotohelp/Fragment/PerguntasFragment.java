package com.example.icaro.newmotohelp.Fragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.icaro.newmotohelp.Especialista.Moto;
import com.example.icaro.newmotohelp.Especialista.MotoService;
import com.example.icaro.newmotohelp.R;
import com.example.icaro.newmotohelp.Tipos.*;

import static com.example.icaro.newmotohelp.R.id.Botao1;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PerguntasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PerguntasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerguntasFragment extends Fragment implements RespostaFragment.OnFragmentInteractionListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private Button Botao1;
    private Activity activity;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FragmentManager fragmentManager;
    private OnFragmentInteractionListener mListener;

    public PerguntasFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerguntasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerguntasFragment newInstance(String param1, String param2) {
        PerguntasFragment fragment = new PerguntasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perguntas, container, false);

        //Repasse de dados do Radio Button - INICIO
        //Os valores retornam um ENUM


        //Repasse de dados do Radio Button - FIM

        Button Botao1 = (Button) v.findViewById(R.id.Botao1);
        Botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RadioGroup radioEstilo =  (RadioGroup) v.findViewById(R.id.rdg1);
                RadioButton rdEstilo = (RadioButton)v.findViewById(radioEstilo.getCheckedRadioButtonId());
                Estilo estilo =  Estilo.getValue(String.valueOf(rdEstilo.getTag()));

                RadioGroup radioFinalidade =  (RadioGroup) v.findViewById(R.id.rdg2);
                RadioButton rdFinalidade = (RadioButton)v.findViewById(radioFinalidade.getCheckedRadioButtonId());
                Finalidade finalidade =  Finalidade.getValue(String.valueOf(rdFinalidade.getTag()));

                RadioGroup radioFaixaValor =  (RadioGroup) v.findViewById(R.id.rdg3);
                RadioButton rdradioFaixaValor = (RadioButton)v.findViewById(radioFaixaValor.getCheckedRadioButtonId());
                FaixaValor faixaValor =  FaixaValor.getValue(String.valueOf(rdradioFaixaValor.getTag()));

                RadioGroup radioTempo =  (RadioGroup) v.findViewById(R.id.rdg4);
                RadioButton rdradioTempo = (RadioButton)v.findViewById(radioTempo.getCheckedRadioButtonId());
                Tempo tempo =  Tempo.getValue(String.valueOf(rdradioTempo.getTag()));

                RadioGroup radioVelocidade =  (RadioGroup) v.findViewById(R.id.rdg5);
                RadioButton rdVelocidade = (RadioButton)v.findViewById(radioVelocidade.getCheckedRadioButtonId());
                Velocidade velocidade =  Velocidade.getValue(String.valueOf(rdVelocidade.getTag()));

                MotoService service = new MotoService();
                Moto moto = service.montaMoto(estilo,faixaValor,finalidade, tempo, velocidade);

                Fragment fr = new Fragment();
                FragmentManager fm = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fm.beginTransaction();
                /*fragmentTransaction.replace(R.id.container, fr);*/
                fragmentTransaction.replace(R.id.container, RespostaFragment.newInstance("", "", moto));
                fragmentTransaction.commit();
            }
        });
        return v;
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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
