package com.example.carteiramobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static ArrayList<String> usuarios = new ArrayList<>();      // Criação do Array de lista de usuários que serão cadastrados
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         // Arquivo de Layout -> Mostra o conteúdo da activity

        View login = findViewById(R.id.btLogin);            // Criando view para o evento de click do botão de Login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                Intent mudatela = new Intent(view.getContext(), CadastroOperacoes.class);       // Intent para fazer a mudança de tela ao clickar em 'Login'
                startActivity(mudatela);        // Inicia a atividade (intent de mudar a tela)
            }
        });


        /*
        View criarUsuario = findViewById(R.id.btCriar);
        criarUsuario.setOnClickListener(new View.OnClickListener() {        // Inicio da função de criar usuario (em teste)

            @Override
            public void onClick(View view) {
                String usuario = ((EditText)findViewById(R.id.etNomeUsuario)).getText().toString();

                Intent criar = new Intent(view.getContext(), MainActivity.class);
                criar.putExtra("novoUsuario", usuario);
                startActivity(criar);

            }
        });
        */
        /*          FUNÇÃO DE CRIAR USUARIO E MANTER LISTA NÃO ESTÁ FUNCIONANDO
        String usuario = this.getIntent().getExtras().getString("novoUsuario");
        usuarios.add(usuario);
        ((TextView)findViewById(R.id.etNomeUsuario)).setText(usuario);
        LinearLayout ll = findViewById(R.id.listaUsuarios);
        for(String novoUsuario: usuarios){
            TextView tv = new TextView(this);
            tv.setText(novoUsuario);
            ll.addView(tv);
        }
        */
    }

    }
