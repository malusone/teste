package com.example.teste

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = AtualizaViewModel

        txtRetorno.text = viewModel.DadosBluetooth()
        viewModel.DadosBluetooth.observe(this, Observer {
            txtRetorno.text = viewModel.DadosBluetooth()
        })



    }
}
