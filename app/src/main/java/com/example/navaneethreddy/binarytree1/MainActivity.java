package com.example.navaneethreddy.binarytree1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView numElementsTV;
    private BinaryTree bt;
    private ViewGroup outputViewGroup;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Core.context = this;

        //get our widgets from our layout
        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.numElementsTV = (TextView)this.findViewById(R.id.numElementsTV);
        this.outputViewGroup = (ViewGroup)this.findViewById(R.id.outputViewGroup);
        this.result= (TextView)findViewById(R.id.textView2);
        //create our binaryTree
        this.bt = new BinaryTree();

        this.updateTreeCount();
    }


    private void updateTreeCount()
    {
        this.numElementsTV.setText("" + this.bt.getCount());
    }

    private void addToTree(String value)
    {
        int payload = Integer.parseInt(value);
        this.bt.add(payload);
        this.updateTreeCount();
    }



    public void addToTreeButtonPressed(View v)
    {
        if(this.inputET.getText().length() > 0)
        {
            String value = this.inputET.getText().toString();
                this.addToTree(value);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Enter the numbers and click the button again", Toast.LENGTH_LONG).show();
        }
    }

   public void inOrderButtonClicked(View v){

       this.result.setText(this.bt.inOrderMethodCall());
   }

    public void preOrderButtonClicked(View v){

        this.result.setText(this.bt.preOrderMethodCall());
    }

    public void postOrderButtonClicked(View v){

        this.result.setText(this.bt.postOrderMethodCall());
    }
}