/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterCookUI;

//imports usados
import java.io.*;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diogo
 */
public class MasterCook extends javax.swing.JFrame {

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Criacao de variaveis                                                                                                                           ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    private String MenuPrincipal, MenuVerDados, MenuInserirDados, MenuCriarNovaEdicao, MenuInsiraEdicao, MenuInsiraNotas, //Strings usadas para guardar os menus
                          MenuEdicoes, MenuConcorrentes, MenuPratos, MenuPenalizacoes, MenuInsiraConcorrente, MenuInsiraPrato, MenuProcurarDado; 
            
    private String dados, dados1, dados2, dados3, dados4, dados5, dados6, dados7, dados8, dados9, dados10; //Strings usadas para guardar inputs do utilizador
    
    private int conta = 1; //variavel de contagem que indica que input e esperado do utilizador
    private int menu = -1; //inicializa a variavel que indica o menu atual com -1
    
    private static TreeMap<Integer, Edicao> edicoes; //treemap edicoes usado para guardar as edicoes (chave -> ano da edicao ; valor -> edicao)
    
    //construtor - inicializacao de strings que guardam os menus e criacao do treemap que guarda as edicoes
    public MasterCook() {
        try {
            initComponents(); //inicializa a interface
            MenuPrincipal = ler("MenuPrincipal.txt"); //inicializa a string menu principal com a informacao guardada no ficheiro "MenuPrincipal.txt" usando o metodo ler (que retorna uma string)
            MenuVerDados = ler("MenuVerDados.txt"); //inicializa a string menu ver dados
            MenuInserirDados = ler("MenuInserirDados.txt"); //inicializa a string menu inserir dados
            MenuInsiraEdicao = ler("InsiraEdicao.txt"); //inicializa a string menu insira edicao (apresenta informacao relacionada com a criacao de uma edicao)
            MenuInsiraConcorrente = ler("InsiraConcorrente.txt"); //inicializa a string menu insira concorrente (apresenta informacao relacionada com a criacao de um concorrente)
            MenuInsiraPrato = ler("InsiraPrato.txt"); //inicializa a string menu insira prato (apresenta informacao relacionada com a criacao de um prato)
            MenuInsiraNotas = ler("InsiraNotas.txt"); //inicializa a string menu insira notas
            MenuEdicoes = ler("MenuEdicoes.txt"); //inicializa a string menu edicoes (apresenta informacao relacionada com a procura de edicoes)
            MenuConcorrentes = ler("MenuConcorrentes.txt"); //inicializa a string menu concorrentes (apresenta informacao relacionada com a procura de concorrentes)
            MenuPratos = ler("MenuPratos.txt"); //inicializa a string menu pratos (apresenta informacao relacionada com a procura de pratos)
            MenuPenalizacoes = ler("MenuPenalizacoes.txt"); //inicializa a string menu penalizacoes (apresenta informacao relacionada com a procura de penalizacoes)
            MenuProcurarDado = ler("MenuProcurarDado.txt"); //inicializa a string menu procurar dado
            edicoes = new TreeMap<>(); //cria o treemap edicoes
        } catch (IOException ex) {
            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        display = new java.awt.TextArea();
        bexecutar = new javax.swing.JButton();
        bsair = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bvoltar = new javax.swing.JButton();
        novosdados = new java.awt.TextField();
        bOK = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setName("MasterCook"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1058, 782));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("MasterCook"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Master Cook");

        display.setBackground(new java.awt.Color(153, 153, 153));
        display.setEditable(false);
        display.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N

        bexecutar.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bexecutar.setText("Executar");
        bexecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexecutarActionPerformed(evt);
            }
        });

        bsair.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bsair.setText("Sair");
        bsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsairActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setName(""); // NOI18N
        label1.setText("Opcoes");

        b2.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bvoltar.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bvoltar.setText("Voltar");
        bvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvoltarActionPerformed(evt);
            }
        });

        novosdados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        novosdados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novosdadosActionPerformed(evt);
            }
        });

        bOK.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bOK.setText("Ok");
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsair)
                            .addComponent(bvoltar)
                            .addComponent(bexecutar))
                        .addGap(396, 396, 396)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novosdados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bOK))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bexecutar)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bvoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novosdados, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bOK)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b5)
                                .addComponent(b4)
                                .addComponent(b3)
                                .addComponent(b2)
                                .addComponent(b1)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        display.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Ler ficheiro                                                                                                                                   ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    //Retorna o numero de linhas
    public static int numeroLinhas(String nome_ficheiro) throws IOException
    {
        FileReader fr = new FileReader(nome_ficheiro);
        BufferedReader bR = new BufferedReader(fr);

        int numero_linhas = 0;
        
        while(bR.readLine() != null) //enquanto nao chegar ao fim do ficheiro
            numero_linhas++; //incrementa a contagem das linhas
        
        bR.close(); //fecha 
        return numero_linhas; //devolve o numero de linhas do ficheiro
    }
    
    //Retorna o conteudo do ficheiro
    public static String ler(String nome_ficheiro) throws IOException //A FAZER - escreve nos treemaps o conteudo do ficheiro ao abrir o programa
    {
        FileReader fr = new FileReader(nome_ficheiro);
        BufferedReader br = new BufferedReader(fr);
        String texto = "";
        int numero_linhas = numeroLinhas(nome_ficheiro); //retorna o numero de linhas do ficheiro e guarda em numero_linhas
        for(int i = 0; i < numero_linhas; i++) //enquanto nao chegar ao fim do ficheiro
        {
            texto += br.readLine() + "\n"; //ler a linha e adicionar à string 'texto' + quebra de linha no final de cada linha
        }
        return texto;
    }
    
    //Coloca a informacao do fiheiro edicoes.txt no treemap edicoes
    public static void lerEdicoes() throws IOException
    {
        try{
            FileReader fR = new FileReader("Edicoes.txt");
            BufferedReader ficheiro = new BufferedReader(fR);
            String linha;
        
            for(int i=0; i<numeroLinhas("Edicoes.txt"); i++) // saltamos as 2 primeiras linhas (1ª linha é a descrição do ficheiro e a 2ª é uma linha em branco) 
            {                                                // ANO|CIDADE|PESO CHEF        Construtor da Edicao:
                linha = ficheiro.readLine();                 //  0 |  1   |   2             (String cidade, int ano, double pesoChef)
                if (i>=2)
                {
                    String[] dados = linha.split(";"); //cria um vetor de strings, cada posição com um dado entre os ';' (indicação do que está em cada posição no comentário acima)
                    edicoes.put( Integer.parseInt(dados[0]), new Edicao(dados[1], Integer.parseInt(dados[0]), Double.parseDouble(dados[2])) ); //cria uma nova edição com os dados lidos
                }
            }
            ficheiro.close();
        } catch(FileNotFoundException fne){ //para o caso do ficheiro não existir, escreve na consola
            System.out.println(fne.getMessage()); }
    }
    
    //Coloca a informacao do fiheiro concorrentes.txt no treemap concorrentes da edicao do concorrente em questao
    public static void lerConcorrentes() throws IOException
    {
        try{
            FileReader fR = new FileReader ("Concorrentes.txt");
            BufferedReader ficheiro = new BufferedReader(fR);
            String linha;
            
            for(int i=0; i<numeroLinhas("Concorrentes.txt"); i++)   // saltamos as 2 primeiras linhas (1ª linha é a descrição do ficheiro e a 2ª é uma linha em branco) 
            {                                                       // NUMERO|NOME|IDADE|SEXO|EDIÇÃO|NOTA TOTAL          Construtor do Concorrente:
                linha = ficheiro.readLine();                        //   0   | 1  |  2  | 3  | 4   | 5                   (String nome, int numero, int idade, String sexo, double nota_total)
                if (i>=2)
                {
                    String[] dados = linha.split(";"); //cria um vetor de strings, cada posição com um dado entre os ';' (indicação do que está em cada posição no comentário acima)
                    edicoes.get(Integer.parseInt(dados[4])).addConcorrente(new Concorrente(dados[1], Integer.parseInt(dados[0]), Integer.parseInt(dados[2]), dados[3], Double.parseDouble(dados[5]))); //adiciona na edição correta o novo concorrente
                }
            }
            
            ficheiro.close();
        } catch(FileNotFoundException fne){ //para o caso do ficheiro não existir, escreve na consola
            System.out.println(fne.getMessage()); }
    }
    
    //Coloca a informacao do fiheiro pratos.txt no treemap pratos do concorrente em questao
    public static void lerPratos() throws IOException
    {
        try{
            FileReader fR = new FileReader ("Pratos.txt");
            BufferedReader ficheiro = new BufferedReader(fR);
            String linha;
        
            for(int i=0; i<numeroLinhas("Pratos.txt"); i++)   // saltamos as 2 primeiras linhas (1ª linha é a descrição do ficheiro e a 2ª é uma linha em branco) 
            {                                                       // NUMERO DO CONCORRENTE | NOME DO PRATO | TIPO | REGIÃO | TEMPO | TEMPO USADO | DUELO | NOTA         Construtor do Prato:
                linha = ficheiro.readLine();                        //           0          | 1             |  2   |  3     |  4    | 5           | 6     | 7             (String nome, String tipo, String regiao, int tempo, int tempo_usado, double nota, boolean duelo)
                if (i>=2)
                {
                    String[] dados = linha.split(";"); //cria um vetor de strings, cada posição com um dado entre os ';' (indicação do que está em cada posição no comentário acima)
                    
                    int ano = procuraConcorrente(Integer.parseInt(dados[0])); //retorna o ano da edição, procurando pelo nº do concorrente
                    boolean duelo = !dados[6].equals("0"); //para ver se é um prato de duelo (se for 0 dá false, 1 dá true)

                    Prato prato = new Prato(dados[1], dados[2], dados[3], Double.parseDouble(dados[4]), Double.parseDouble(dados[5]), duelo, Double.parseDouble(dados[7])); //cria o novo prato com os dados lidos do ficheiro
                    edicoes.get(ano).getConcorrentes().get(Integer.parseInt(dados[0])).addPrato(prato); //acrescenta o prato ao concorrente
                }
            }
            ficheiro.close();
        } catch(FileNotFoundException fne){ //para o caso do ficheiro não existir, escreve na consola
            System.out.println(fne.getMessage()); }
    }
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Escreve Ficheiro                                                                                                                               ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    //Coloca a informacao do treemap edicoes no ficheiro edicoes.txt
    public static void escreverEdicoes() throws IOException
     {
        try
        {
            FileWriter fW = new FileWriter("Edicoes.txt");
            BufferedWriter bW = new BufferedWriter(fW);
            PrintWriter ficheiro = new PrintWriter(bW);

            ficheiro.println("ANO | CIDADE | PESO CHEF"); //se o PESO CHEF for 0 entao a edição nao tem chef
            ficheiro.println(""); //para o notepad mostrar a linha de intrevalo... (se puser \n no final da instrução anterior nao mostra a linha em branco)
            for(Edicao e : edicoes.values()) //para cada edição
                ficheiro.println(e.getAno()+";"+e.getCidade()+";"+e.getPesoChef()); //escreve o ano, a cidade e o peso do chef (0 se não tiver chef) no ficheiro, tudo separado por ';'

            ficheiro.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Erro a abrir o ficheiro Edicoes.txt no metodo escreverEdicoes()");
        }
    }
    
    //Coloca a informacao do treemap concorrentes no ficheiro concorrentes.txt
    public static void escreverConcorrentes() throws IOException
    {
        try 
        {
            FileWriter fW = new FileWriter("Concorrentes.txt");
            BufferedWriter bW = new BufferedWriter(fW);
            PrintWriter ficheiro = new PrintWriter(bW);

            ficheiro.println("NUMERO | NOME | IDADE | SEXO | EDIÇÃO | NOTA TOTAL");
            ficheiro.println("");
            for(Edicao e : edicoes.values()) //para cada edição de 'edicoes'
            {
                for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente de 'edicao'
                    ficheiro.println(c.getNumero()+";"+c.getNome()+";"+c.getIdade()+";"+c.getSexo()+";"+e.getAno()+";"+c.getNota_total()); //escreve no ficheiro o numero, nome, idade, sexo, ano da edição e a nota_total, tudo separado por ';'
            }

            ficheiro.close();
        }
        catch (IOException ex) 
        {
            System.out.println("Erro a abrir o ficheiro Concorrentes.txt no metodo escreverConcorrentes()");
        }
    }
    
    //Coloca a informacao do treemap pratos no ficheiro pratos.txt
    public static void escreverPratos() throws IOException
    {
        FileWriter fW = new FileWriter("Pratos.txt");
        BufferedWriter bW = new BufferedWriter(fW);
        PrintWriter ficheiro = new PrintWriter(bW);
        
        ficheiro.println("NUMERO DO CONCORRENTE | NOME DO PRATO | TIPO | REGIÃO | TEMPO | TEMPO USADO | DUELO | NOTA");
        ficheiro.println("");
        
        for(Edicao e : edicoes.values()) //para cada edição de 'edicoes'
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente de 'edicao'
            {
                for(Prato p : c.getPratos().values()) //para cada prato de 'concorrente'
                {
                    DecimalFormat fmt = new DecimalFormat("0.00"); //força usar 2 casas decimais, mesmo que a última (ou as 2) sejam 0
                    if(p.isDuelo()) //se duelo==true então imprime os dados normais + 1 no lugar do duelo
                        ficheiro.println(c.getNumero()+";"+p.getNome()+";"+p.getTipo()+";"+p.getRegiao()+";"+fmt.format(p.getTempo()).replace(',','.')+";"+fmt.format(p.getTempo_usado()).replace(',','.')+";1;"+fmt.format(p.getNota()).replace(',','.'));
                    else //se duelo==false então imprime os dados normais + 1 no lugar do duelo
                        ficheiro.println(c.getNumero()+";"+p.getNome()+";"+p.getTipo()+";"+p.getRegiao()+";"+fmt.format(p.getTempo()).replace(',','.')+";"+fmt.format(p.getTempo_usado()).replace(',','.')+";0;"+fmt.format(p.getNota()).replace(',','.'));
                }       //tivemos que adicionar .replace(',','.') no caso dos doubles porque ele substituía os pontos por vírgulas devido ao DecimalFormat
            }
        }
        
        ficheiro.close();
    }
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       TreeMap                                                                                                                               ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    //ve se um prato com determinado nome e unico entre edicoes (retorna 1 se for unico ou se houver no maximo 1 prato destes mas de duelo)
    public int verificaPratoUnico(Edicao e, String nome) 
    {
        int aux = 0;
        for( Concorrente c : e.getConcorrentes().values()) //para cada concorrente
        {
            for( Prato p : c.getPratos().values()) //para cada prato
            {
                if( p.getNome().equals(nome)) //compara o nome do prato com o que estamos a verificar (String nome)
                {
                    if( !p.isDuelo() ) //se forem iguais e o prato não for de duelo retorna -1
                        return -1;
                    else //se forem iguaise o prato for de duelo
                    {
                        aux++; //incrementa o auxiliar
                        if( aux > 1) //se existir mais do que um prato de duelo com este nome retorna 0
                            return 0;
                    }
                }     
            }
        }
        if(aux == 0) //se não existir ainda nenhum prato com este nome nesta edição, retorna 1
            return 1;
        else // (aux == 1 ) se existir apenas um prato com este nome e que seja de duelo, retorna 2
            return 2;
    }
    
    //ve se determinado concorrente ja tem 4 pratos
    public boolean verificaPratos(Concorrente c)
    {
        int aux = 0;
        for( Prato p : c.getPratos().values() ) //para cada prato do concorrente
            aux++; //incrementa aux
        return aux >= 4; //retorna true/false dependendo se o concorrente já tem todos os pratos ou não
    }
    
    //ve se determinado concorrente ja tem prato do duelo
    public boolean verificaPratoDuelo(Concorrente c)
    {
        for( Prato p : c.getPratos().values()) //para cada prato do concorrente
        {
            if(p.isDuelo()) //se algum prato for de duelo
                return true;
        } //se nenhum for de duelo
        return false;
    }
    
    //ve se ja tem 4 concorrentes de determinado sexo
    public boolean contaSexo(Edicao e, String sexo)
    {
        int aux = 0;
        for( Concorrente c : e.getConcorrentes().values() ) //para cada concorrente
            if( c.getSexo().toLowerCase().equals(sexo.toLowerCase()) ) //vê se é do mesmo sexo que o passado como parâmetro
                aux++; //incrementa aux
        return aux >= 4; //retorna true/false conforme a edição já tenha 4 concorrentes deste sexo ou não
    }
    
    //ve se ja tem 8 concorrentes em determinada edicao
    public boolean verificaConcorrentes(Edicao e)
    {
        int aux = 0;
        for( Concorrente c : e.getConcorrentes().values() ) //para cada concorrente
            aux++; //incrementa aux
        return aux >= 8; //retorna true/false conforme a edição já esteja cheia ou não
    }
    
    //retorna true se um concorrente com dado numero nao existir
    public boolean verificaConcorrenteUnico(int numero)
    {
        for(Edicao e : edicoes.values()) //para todas as edições
        {
            if(e.getConcorrentes().keySet().contains(numero)) //verifica se já existe um concorrente com este nº
                return false;   //se já existir algum, retona false ("não é único")
        }
        return true; //se não existir nenhum com o mesmo nº, returna true ("é único")
    }
    
    //verifica se o outro prato tem dados diferentes
    public boolean verificaDados(Prato p, String tipo, String regiao, double tempo)
    {
        if(!p.getTipo().equals(tipo)) //se o prato p tiver um 'tipo' diferente do passado como parâmetro
            return true;
        if(!p.getRegiao().equals(regiao)) //se o prato p tiver uma 'regiao' diferente da passada como parâmetro
            return true;
        return p.getTempo() != tempo; //retorna true/false conforme o 'tempo' do prato p seja diferente/igual ao do 'tempo' passado como parâmetro
    }
    
    //procura nas edicoes um concorrente com o numero especificado e se encontrar retorna o ano da edicao
    public static int procuraConcorrente(int numero)
    {
        int ano=-1; //inicializa o ano a -1 para fácil deteção de erro após a função ser chamada
        for(Edicao e : edicoes.values()) //para cada edição
        {
            if(e.contemConcorrente(numero)) //verifica se existe algum concorrente com este nº
                ano = e.getAno(); //se existir então irá retornar 'ano' com o ano da edição
        }
        return ano;
    }
    
    //retorna o numero do concorrente de uma edicao 'e' que tem o prato com o nome passado como parametro
    public static int retornaNumeroConcorrentePrato(Edicao e, String nome_prato)
    {
        for(Concorrente c : e.getConcorrentes().values())//para cada concorrente desta edição
        {
            for(Prato p : c.getPratos().values()) //para cada prato
            {
                if(p.getNome().toLowerCase().equals(nome_prato.toLowerCase())) //verifica se o nome do prato é igual ao passado como parâmetro
                    return c.getNumero(); //se forem iguais então retorna o nº do concorrente
            }
        }
        return -1; //se nenhum prato tiver o mesmo nome então retorna -1
    }
    
    //utilizado para obter a nota do prato de duelo com um dado nome que ja estava atribuido
    public int procuraPratoDuelo(Edicao e, String nome)
    {
        for(Concorrente c : e.getConcorrentes().values())//para cada concorrente desta edição
        {
            for(Prato p : c.getPratos().values())//para cada prato
            {
                if(p.getNome().toLowerCase().equals(nome.toLowerCase())) //se existir algum prato com o mesmo nome do que foi passado como parâmetro
                    return (int) p.getNota(); //retorna a nota desse prato (que irá ser 10 ou 0)
            }
        }
        return -2; //se não encontrar prato com o mesmo nome, retorna -2
    }
    
    //é utilizada para retornar o nº do concorrente com certa nota
    public static int procuraNota(Edicao e, double nota)
    {
        for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente desta edição
        {
            if(c.getNota_total() == nota) //vê se a nota do concorrente é igual à passada como parâmetro
                return c.getNumero(); //se forem iguais então retorna o nº do concorrente
        }
        return -1; //se não forem iguais retorna -1
    }
    
    //retorna o numero do concorrente da edicao 'e' que tem um prato com um dado nome
    public int pesquisaPrato(Edicao e, String nome)
    {
        int numero=-1;
        for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente desta edição
        {
            for(Prato p : c.getPratos().values()) //para cada prato
            {
                if(p.getNome().toLowerCase().equals(nome.toLowerCase())) //se os nomes do prato e o que foi passado como parâmetro forem iguais
                    numero = c.getNumero(); //atualiza 'numero' com o nº do concorrente
            }
        }
        return numero;
    }
            
    //devolve as 2 melhores notas de um concorrente
    public static String devolveMelhoresNotas(Concorrente c)
    {
        String texto="";
        TreeMap<Double, Prato> notas = new TreeMap<>(); //criar uma TreeMap auxiliar ordenada pelas notas dos pratos
        double m1=-2, m2=-3; //m1 - melhor (prato) 1   |   m2 - melhor (prato) 2

        for(Prato p : c.getPratos().values()) //para cada prato do concorrente
        {
            if(p.getNota()!=-1) //se o prato já tiver sido avaliado
            {
                notas.put(p.getNota(), p); //introduz na treemap o prato
                if(p.getNota()>m1) //se a nota deste prato for maior à anterior 'máximo'
                    m1 = p.getNota(); //atualiza m1 com essa nota
            }
        }

        for(Prato p : c.getPratos().values()) //para cada prato novamente após já termos a melhor nota
        {
            if(p.getNota()!=-1) //se o prato já tiver sido avaliado
            {
                if(p.getNota()>m2 && p.getNota()!=m1) //se a nota do prato for maior que a atual '2ª maior' e não seja a nota 'máxima' deste concorrente
                    m2 = p.getNota(); //atualiza m2 com essa nota
            }
        }
        if(notas.size()<2) //confirmar que existem 2 pratos avaliados na TreeMap
            return texto+="\nO concorrente não tem pelo menos 2 pratos avaliados.";

        texto+= notas.get(m1).getNota() + ";" + notas.get(m2).getNota(); //retorna uma string com as 2 melhores notas separadas por ':'
        return texto;
    }
    
    //retorna uma string com a informacao da edicao e
    public static String imprimeEdicoes(Edicao e)
    {
        String resultado = e.getAno() + "    " + e.getCidade() + "    " + e.getPesoChef() + "\n";
        return resultado;
    }
    
    //retorna uma string com a informacao do concorrente c
    public static String imprimeConcorrentes(Edicao e, Concorrente c)
    {
        String resultado = c.getNumero() + "    " + c.getNome() + "    " + c.getIdade() + "    " + c.getSexo() + "    " + e.getAno() + "    "; //cria uma string com o nº, nome, idade e sexo do concorrente e o ano da edição
        
        if(c.getNota_total() == -1) //se o concorrente ainda não tiver nota_total (pelo menos 1 prato não avaliado)
            resultado = resultado + "nd\n"; //adicionar "nd" à string ("não determinado")
        else //se tiver nota_total
            resultado = resultado + c.getNota_total() + "\n"; //adicionar a nota à string
        
        return resultado;
    }
    
    //retorna uma string com a informacao do prato p
    public static String imprimePratos(Concorrente c, Prato p)
    {   //criar uma string com o nº da edição, nº do concorrente, nome, tipo, regiao, tempo e tempo usado do prato
        String resultado = procuraConcorrente(c.getNumero()) + "     " + c.getNumero() + "     " + p.getNome() + "     " + p.getTipo() + "     " + p.getRegiao() + "     " + p.getTempo() + "     " + p.getTempo_usado() + "     ";
        
        if(p.isDuelo()) //se o prato for de duelo
            resultado += "Sim" + "     "; //acrescenta "Sim" à string
        else //se não for de duelo
            resultado += "Não" + "     "; //acrescenta "Não"
        
        if(p.getNota() == -1) //se o prato ainda não tiver sido avaliado
            resultado += "nd\n"; //acrescenta "nd" à string
        else //se já tiver sido avaliado
        {
            DecimalFormat fmt = new DecimalFormat("0.00"); //força usar 2 casas decimais, mesmo que a última (ou as 2) sejam 0
            resultado += fmt.format(p.getNota()) + "\n";  //acrescentar a nota à string
        }
        return resultado;
    }
    
    //retorna uma string com os melhores pratos do concorrente c se este tiver 2
    public static String imprimeMelhoresPratos(Concorrente c)
    {
        TreeMap<Double, Prato> notas = new TreeMap<>(); //cria TreeMap auxiliar com os pratos e ordenada por nota para fácil obtenção do nome do prato
        double m1=-2, m2=-3; //m1 - melhor (prato) 1   |   m2 - melhor (prato) 2

        for(Prato p : c.getPratos().values()) //para cada prato do concorrente
        {
            if(p.getNota()!=-1) //se o prato já tiver sido avaliado
            {
                notas.put(p.getNota(), p); //introduz na treemap o prato
                if(p.getNota()>m1) //se a nota deste prato for maior à anterior 'máximo'
                    m1 = p.getNota(); //atualiza m1 com essa nota
            }
        }

        for(Prato p : c.getPratos().values()) //para cada prato novamente após já termos a melhor nota
        {
            if(p.getNota()!=-1) //se o prato já tiver sido avaliado
            {
                if(p.getNota()>m2 && p.getNota()!=m1) //se a nota do prato for maior que a atual '2ª maior' e não seja a nota 'máxima' deste concorrente
                    m2 = p.getNota(); //atualiza m2 com essa nota
            }
        }

        if(notas.size()<2) //confirmar que existem 2 pratos avaliados na TreeMap
            return "\nO concorrente não tem pelo menos 2 pratos avaliados.";

        String texto = "\n\nOs dois melhores pratos são: ";
        texto+="\n1º - "+notas.get(m1).getNome(); //ir buscar à TreeMap com as notas o nome do prato com esta nota
        texto+="\n2º - "+notas.get(m2).getNome(); //ir buscar à TreeMap com as notas o nome do prato com esta nota

        return texto;
    }
    
    //retorna um treemap com as notas dos concorrentes da edicao 'e' ordenados por ordem decrescente
    public static TreeMap<Double, Concorrente> organizaNotasConcorrentes(Edicao e)
    {
        TreeMap<Double, Concorrente> notas = new TreeMap<>(Collections.reverseOrder()); //criar uma TreeMap auxiliar com os concorrentes ordenada por notas por ordem inversa (notas mais altas primeiro)
        for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente desta edição
        {
            notas.put(c.getNota_total(),c); //adicionar à TreeMap
        }
        return notas;
    }
          
     //Retorna a informacao das edicoes guardadas no TreeMap edicoes
    public static String consultaEdicoes() throws IOException
    {
        String resultado = "|    ANO    |    CIDADE    |    PESO CHEF    |\n\n";
        for(Edicao e : edicoes.values()) //para cada edição
            resultado += imprimeEdicoes(e); //acrescenta à string as informações da edição
        return resultado;
    }
    
    //Retorna a informacao das edicoes (que tiveram correspondencia com o dado procurado) guardadas na TreeMap edicoes
    public static String consultaEdicoes(String dado, String criterio) throws IOException
    {
        String resultado = "|    ANO    |    CIDADE    |    PESO CHEF    |\n\n";
        for(Edicao e : edicoes.values()) //para cada de edição
        {
            switch (criterio.toLowerCase()) {
                case "ano": //se o critério for o ano
                    if(dado.matches("[0-9]+") && !dado.matches("[a-zA-Z]+")) //verificar que o input é apenas numérico
                    {
                        if(e.getAno() == Integer.parseInt(dado)) //verificar se o ano da edição é igual ao ano passado como parâmetro (dado)
                            resultado += imprimeEdicoes(e); //acrescenta a informação da edição à string
                    }
                    else //se o input não for apenas numérico
                        return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                    break;
                case "cidade": //se o critério for a cidade
                    if(!dado.matches("[0-9]+")) //verificar que o input não é numérico
                    {
                        if(e.getCidade().equals(dado)) //verificar se a cidade da edição é igual à cidade passada como parâmetro (dado)
                            resultado = resultado + imprimeEdicoes(e); //acrescenta a informação da edição à string
                    }
                    else //se o input não for apenas numérico
                        return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                    break;
                case "peso":
                    if(dado.contains(".") || dado.contains(",")) //verificar se o input tem parte decimal
                    {
                        dado = dado.replaceAll(",", "."); //se o nº foi introduzido com a vírgula como símbolo decimal, substituir por ponto
                        try
                        {
                            if(e.getPesoChef() == Double.parseDouble(dado)) //verificar se o peso do chef da edição é igual ao peso do chef passado como parâmetro (dado)
                                resultado = resultado + imprimeEdicoes(e); //acrescenta a informação da edição à string
                        }
                        catch(NumberFormatException nfe)
                        {
                            return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                        }
                    }
                    else //se o input não for um valor decimal
                        return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                    break;
                default:
                    break;
            }
        }
        return resultado;
    }
    
    //Retorna a informacao dos concorrentes guardados nos TreeMaps concorrentes
    public static String consultaConcorrentes() throws IOException
    {
        String resultado = "|    NUMERO    |    NOME    |    IDADE    |    SEXO    |    EDIÇÃO    |    NOTA FINAL   |\n\n";
        for(Edicao e : edicoes.values()) //para cada edição
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente
            {
                calculaNota(c.getNumero()); //calcula a nota deste concorrente
                resultado += imprimeConcorrentes(e, c); //imprime a informação deste concorrente + ano da edição
            }
        }
        return resultado;
    }
    
    //Retorna a informacao dos concorrentes (que tiveram correspondencia com o dado procurado) guardados nos TreeMaps concorrentes
    public static String consultaConcorrentes(String dado, String criterio) throws IOException
    {
        String resultado = "|    NUMERO    |    NOME    |    IDADE    |    SEXO    |    EDIÇÃO    |    NOTA FINAL   |\n\n";
        for(Edicao e : edicoes.values()) //para cada edição
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente
            {
                calculaNota(c.getNumero()); //calcula a nota deste concorrente
                switch (criterio.toLowerCase()) {
                    case "nome": //se o critério for o nome
                        if(!dado.matches("[0-9]+")) //verificar que o input não é numérico
                        {
                            if(c.getNome().equals(dado)) //verificar se o nome do concorrente é igual ao nome passado como parâmetro (dado)
                                resultado = resultado + imprimeConcorrentes(e, c); //acrescenta a informação do concorrente + ano da edição à string
                        }
                        else
                            return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                        break;
                    case "numero": //se o critério for o nº
                        if(dado.matches("[0-9]+")) //verificar que o input é numérico
                        {
                            if(c.getNumero() == Integer.parseInt(dado)) //verificar se o nº do concorrente é igual ao nº passado como parâmetro (dado)
                                resultado = resultado + imprimeConcorrentes(e, c);//acrescenta a informação do concorrente + ano da edição à string
                        }
                        else
                            return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                        break;
                    case "idade": //se o critério for a idade
                        if(dado.matches("[0-9]+")) //verificar que o input é numérico
                        {
                            if(c.getIdade() == Integer.parseInt(dado)) //verificar se a idade do concorrente é igual à idade passada como parâmetro (dado)
                                resultado = resultado + imprimeConcorrentes(e, c);//acrescenta a informação do concorrente + ano da edição à string
                        }
                        else
                            return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                        break;
                    case "sexo": //se o critério for o sexo
                        if(dado.matches("[a-zA-Z]+") && !dado.matches("[0-9]+")) //verificar que o input é apenas uma palavra e não contém números
                        {
                            if(c.getSexo().equals(dado)) //verificar se o sexo do concorrente é igual ao sexo passado como parâmetro (dado)
                                resultado = resultado + imprimeConcorrentes(e, c);//acrescenta a informação do concorrente + ano da edição à string
                        }
                        else
                            return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                        break;
                    case "edicao": //se o critério for a edição
                        if(dado.matches("[0-9]+")) //verificar que o input é numérico
                        {
                            if(e.getAno() == Integer.parseInt(dado)) //verificar se o ano da edição é igual ao ano passado como parâmetro (dado)
                                resultado = resultado + imprimeConcorrentes(e, c);//acrescenta a informação do concorrente + ano da edição à string
                        }
                        else
                            return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                        break;
                    default:
                        break;
                }
            }
        }
        if(criterio.toLowerCase().equals("nota")) //se o critério for a nota
        {
            try
            {
                if(!dado.matches("[a-zA-Z]+")) //verifica que o input não é uma palavra
                {
                    for(Concorrente c : organizaNotasConcorrentes(edicoes.get(Integer.parseInt(dado))).values()) //para todos os concorrentes (da TreeMap ordenada pelas notas)
                    {
                        resultado += imprimeConcorrentes(edicoes.get(Integer.parseInt(dado)), c); //adicionar à string a informação dos concorrentes por ordem
                    }
                }
                else
                    return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
            }
            catch(NullPointerException npe)
            {
                return "\n\n\nNao existe uma edicao do ano " + dado + "! Clique em voltar para voltar atras!";
            }
        }
        return resultado;
    }
    
    //Retorna a informacao dos pratos guardados nos TreeMaps pratos
    public static String consultaPratos() throws IOException
    {
        String resultado = "EDIÇÃO | NUMERO | NOME DO PRATO | TIPO | REGIÃO | TEMPO | TEMPO USADO | DUELO | NOTA\n\n";
        for(Edicao e : edicoes.values()) //para cada edição
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente
                for(Prato p : c.getPratos().values()) //para cada prato
                    resultado += imprimePratos(c, p); //acrescenta à string a informação do prato + o nº do concorrente e o nº da edição
        }
        return resultado;
    }
    
    //Retorna a informacao dos pratos (que tiveram correspondencia com o dado procurado) guardados nos TreeMaps pratos
    public static String consultaPratos(String dado, String criterio) throws IOException
    {
        String resultado = "EDIÇÃO | NUMERO | NOME DO PRATO | TIPO | REGIÃO | TEMPO | TEMPO USADO | DUELO | NOTA\n\n";
        for(Edicao e : edicoes.values()) //para cada edição
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente
            {
                for(Prato p : c.getPratos().values()) //para cada prato
                {
                    switch (criterio.toLowerCase()) {
                        case "numero": //se o critério for o nº
                            if(dado.matches("[0-9]+")) //verifica que o input é numérico
                            {
                                if(c.getNumero() == Integer.parseInt(dado)) //verificar se o nº do concorrente é igual ao nº passado como parâmetro (dado)
                                    resultado += imprimePratos(c, p); //acrescenta a informação do prato + ano da edição + nº do concorrente à string
                            }
                            else
                                return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                            break;
                        case "nome": //se o critério for o nome
                            if(!dado.matches("[0-9]+")) //verifica que o input não é numérico
                            {
                                if(p.getNome().equals(dado)) //verificar se o nome do prato é igual ao nome passado como parâmetro (dado)
                                    resultado = resultado + imprimePratos(c, p); //acrescenta a informação do prato + ano da edição + nº do concorrente à string
                            }
                            else
                                return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                            break;
                        case "tipo": //se o critério for o tipo
                            if(!dado.matches("[0-9]+")) //verifica que o input não é numérico
                            {
                                if(p.getTipo().equals(dado)) //verificar se o tipo do prato é igual ao tipo passado como parâmetro (dado)
                                    resultado = resultado + imprimePratos(c, p); //acrescenta a informação do prato + ano da edição + nº do concorrente à string
                            }
                            else
                                return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                            break;
                        case "regiao": //se o critério for a regiao
                            if(!dado.matches("[0-9]+")) //verifica que o input não é numérico
                            {
                                if(p.getRegiao().equals(dado)) //verificar se a regiao do prato é igual à regiao passada como parâmetro (dado)
                                    resultado = resultado + imprimePratos(c, p); //acrescenta a informação do prato + ano da edição + nº do concorrente à string
                            }
                            else
                                return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                            break;
                        case "tempo": //se o critério for o tempo
                            if(dado.matches("[0-9]+")) //verifica que o input é numérico
                            {
                                if(p.getTempo() == Double.parseDouble(dado)) //verificar se o tempo do prato é igual ao tempo passado como parâmetro (dado)
                                    resultado = resultado + imprimePratos(c, p); //acrescenta a informação do prato + ano da edição + nº do concorrente à string
                            }
                            else
                                return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
                            break;
                        default:
                            break;
                    }
                }
                if(criterio.toLowerCase().equals("numero")) //se o critério for o nº
                    if(c.getNumero() == Integer.parseInt(dado)) //se o nº do concorrente for igual ao nº passado como parâmetro (dado)
                        resultado += imprimeMelhoresPratos(c); //acrescentar à string a informação dos melhores pratos do concorrente
            }
        }
        if(criterio.toLowerCase().equals("duelo")) //se o critério for duelo
        {
            try
            {
                if(dado.matches("[0-9]+")) //verifica que o input é numérico
                {
                    for(Concorrente c : edicoes.get(Integer.parseInt(dado)).getConcorrentes().values()) //para cada concorrente
                    {
                        for(Prato p : c.getPratos().values()) //para cada prato
                        {
                            if(p.isDuelo()) //verifica se o prato é de duelo
                                resultado += imprimePratos(c, p); //se for acrescenta os dados desse prato à string
                        }
                    }
                }
                else
                    return "\n\n\nDados invalidos! Clique em voltar para voltar atras!";
            }
            catch(NullPointerException npe)
            {
                return "\n\n\nNao existe uma edicao do ano " + dado + "! Clique em voltar para voltar atras!";
            }
        }
        return resultado;
    }
    
    //Calcula as penalizacoes de um dado concorrente
    public int calculaPenalizacoes(int numero) throws NullPointerException
    {
        int ano = procuraConcorrente(numero); //guardar em 'ano' o ano da edição em que o concorrente de nº 'numero' está inscrito
        
           //se este concorrente já tiver 4 pratos e não houverem penalizações guardadas
        if(edicoes.get(ano).getConcorrentes().get(numero).getPratos().size() == 4 && edicoes.get(ano).getConcorrentes().get(numero).getPenalizacoes().isEmpty())
        {
            for(Prato p : edicoes.get(ano).getConcorrentes().get(numero).getPratos().values()) //para cada prato
            {
                if(p.getTempo() < p.getTempo_usado()) //se o tempo de confeção exceder o tempo limite
                    edicoes.get(ano).getConcorrentes().get(numero).getPenalizacoes().add(0.2); //adicionar penalização de 20%
                else //se o tempo de confeção não exceder o tempo limite
                    edicoes.get(ano).getConcorrentes().get(numero).getPenalizacoes().add(0.0); //adicionar penalização de 0% (igual a não haver penalização)
            }
        }
        else if(edicoes.get(ano).getConcorrentes().get(numero).getPratos().size() != 4) //se o concorrente ainda não tiver todos os pratos criados
        {
            display.replaceRange("Este concorrente ainda nao tem todos os pratos atribuidos!", 600, 670);
            sleep(2500);
            display.replaceRange("", 598, 670);
            return -1;
        }
        return 1;
    }
    
    //Calcula as notas de um dado concorrente
    public static void calculaNota(int numero)
    {
        int ano = procuraConcorrente(numero); //guarda em 'ano' o ano da edição em que o concorrente de nº 'numero' está inscrito
        double nota_total = 0;
        double penalizacao = 1.0;
        double nota1 = -1.0;
        double nota2 = -1.0;
        Concorrente c = edicoes.get(ano).getConcorrentes().get(numero); //vai buscar o concorrente com o nº introduzido
        if(c.getPratos().size() == 4) //se o concorrente já tiver 4 pratos
        {
           try{
                String[] dados = devolveMelhoresNotas(c).split(";"); //guarda em dados[0] a melhor nota e em dados[1] a 2ª melhor nota
                for(Prato p : c.getPratos().values()) //para cada prato do concorrente
                {
                    if(p.getNota() == Double.parseDouble(dados[0])) // se a nota do prato for igual à melhor nota do concorrente
                    {
                        if(p.getTempo() < p.getTempo_usado()) //se o tempo de confeção for superior ao tempo limite
                            penalizacao = 0.8; //penalização passa de 1 para 0.8
                        nota1 = p.getNota() * penalizacao; //nova nota passa a ser a 80% da nota anterior (se penalização for 0.8) ou a mesma (se penalização for 1 - não haver penalização)
                    }
                }
                penalizacao = 1.0; //para o caso de ter encontrado penalização no caso anterior
                for(Prato p : c.getPratos().values()) //para cada prato
                {
                    if(p.getNota() == Double.parseDouble(dados[1])) //verifica se a nota do prato é igual à 2ª melhor nota do concorrente
                    {
                        if(p.getTempo() < p.getTempo_usado()) //se o tempo de confeção exceder o tempo limite
                            penalizacao = 0.8; //penalização passa de 1 para 0.8
                        nota2 = p.getNota() * penalizacao; //nova nota passa a ser a 80% da nota anterior (se penalização for 0.8) ou a mesma (se penalização for 1 - não haver penalização)
                    }
                }

                nota_total = (nota1 + nota2)/2.0; //nota do concorrente (nota_total) passa a ser a média dos seus 2 melhores pratos
                c.setNota_total(nota_total); //colocar a nota no concorrente
           } catch(NumberFormatException nfe){
               return;
           }
        }
        else //se o concorrente ainda não tiver 4 pratos
            display.setText("\n\n\nEste concorrente ainda nao tem todos os pratos atribuidos!\n\nClique em voltar para voltar atras!");
    }
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Interface                                                                                                                                      ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /*MENUS (alguns temporarios)
    1 - ver dados
    2 - inserir dados
    3 - criar nova edicao
    4 - consultar edicoes
    5 - consultar concorrentes
    6 - consultar pratos
    7 - inserir edicoes
    8 - inserir concorrentes
    9 - inserir pratos
    10 - menu edicoes
    11 - menu concorrentes
    12 - menu pratos
    13- consultar penalizacoes
    14- menu penalizacoes
    15- menu vencedores
    16- menu insira notas
    17- clique voltar para voltar atras
    */
    
    //espera durante "tempo" ms
    private void sleep(int tempo)
    {
        try 
        {
            Thread.sleep(tempo);
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //coloca no display o menu insira edicao
    private void apresentaMenuInsiraEdicao(int menu)
    {
        display.setText(MenuInsiraEdicao); //coloca no display as strings do ficheiro MenuInsiraEdicao
        this.menu = menu;
    }
    
    //coloca no display o menu insira concorrente
    private void apresentaMenuInsiraConcorrente(int menu)
    {
        display.setText(MenuInsiraConcorrente); //coloca no display as strings do ficheiro MenuInsiraConcorrente
        this.menu = menu;
    }
    
    //coloca no display o menu insira prato
    private void apresentaMenuInsiraPrato(int menu)
    {
        display.setText(MenuInsiraPrato); //coloca no display as strings do ficheiro MenuInsiraPrato
        this.menu = menu;
    }
    
    //coloca no display o menu insira notas
    private void apresentaMenuInsiraNotas(int menu)
    {
        display.setText(MenuInsiraNotas); //coloca no display as strings do ficheiro MenuInsiraNotas
        this.menu = menu;
    }
    
    //coloca no display o menu principal
    private void apresentaMenuPrincipal(int menu)
    { 
        display.setText(MenuPrincipal); //coloca no display as strings do ficheiro MenuPrincipal
        this.menu = menu;
    }
    
    //coloca no display o menu ver dados
    private void apresentaMenuVerDados(int menu)
    {
        display.setText(MenuVerDados); //coloca no display as strings do ficheiro MenuVerDados
        this.menu = menu;
    }
    
    //coloca no display o menu inserir dados
    private void apresentaMenuInserirDados(int menu)
    {
        display.setText(MenuInserirDados); //coloca no display as strings do ficheiro MenuInserirDados
        this.menu = menu;
    }
    
    //coloca no display o menu edicoes
    private void apresentaMenuEdicoes(int menu)
    {
        display.setText(MenuEdicoes); //coloca no display as strings do ficheiro MenuEdicoes
        this.menu = menu;
    }
    
    //coloca no display o menu concorrentes
    private void apresentaMenuConcorrentes(int menu)
    {
        display.setText(MenuConcorrentes); //coloca no display as strings do ficheiro MenuConcorrentes
        this.menu = menu;
    }
    
    //coloca no display o menu pratos
    private void apresentaMenuPratos(int menu)
    {
        display.setText(MenuPratos); //coloca no display as strings do ficheiro MenuPratos
        this.menu = menu;
    }
    
    //coloca no display o menu procurar dado
    private void apresentaMenuProcurarDado()
    {
        display.setText(MenuProcurarDado); //coloca no display as strings do ficheiro MenuProcurarDado
    }
    
    //coloca no display o menu penalizacoes
    private void apresentaMenuPenalizacoes(int menu)
    { 
        display.setText(MenuPenalizacoes); //coloca no display as strings do ficheiro MenuPenalizacoes
        this.menu = menu;
    }
    
    //coloca no display a informacao de todas as edicoes
    public void apresentaEdicoes(int menu) throws IOException
    {
        display.setText(consultaEdicoes()); //coloca no display as strings que recebe de consultaEdicoes
        this.menu = menu;
        conta = 1;
    }
    
    //coloca no display a informacao de todos os concorrentes de todas as edicoes
    public void apresentaConcorrentes(int menu) throws IOException
    {
        display.setText(consultaConcorrentes()); //coloca no display as strings que recebe de consultaConcorrentes
        this.menu = menu;
        conta = 1;
    }
    
    //coloca no display a informacao de todas os pratos de todos os concorrentes de todas as edicoes
    public void apresentaPratos(int menu) throws IOException
    {
        display.setText(consultaPratos()); //coloca no display as strings que recebe de consultaPratos
        this.menu = menu;
        conta = 1;
    }
    
    //coloca no display as penalizacoes de um concorrente com dado numero
    public void apresentaPenalizacoes(int menu, int numero)
    {
        String penalizacoes = "| NUMERO | PENALIZACAO 1 | PENALIZACAO 2 | PENALIZACAO 3 | PENALIZACAO 4 |\n\n";
        penalizacoes += numero; //acrescenta o nº do concorrente à string
        Concorrente c = edicoes.get(procuraConcorrente(numero)).getConcorrentes().get(numero); //vai buscar o concorrente de nº 'numero'
        for(int i = 0 ; i <= 3 ; i++) //para os 4 pratos
            penalizacoes += "   " + c.getPenalizacoes().get(i); //acrescenta à string o valor da penalização
        display.setText(penalizacoes); //coloca no display a string penalizacoes
        this.menu = menu;
        conta = 1;
    }
    
    //coloca no display os vencedores das edicoes (se possivel)
    public void apresentaVencedores()
    {
        String vencedores = "| EDICAO | NUMERO | SEXO | NOME | IDADE | NOTA TOTAL |\n\n";
        double nota = 0;
        for(Edicao e : edicoes.values()) //para cada edição
        {
            vencedores = vencedores + e.getAno() + "    "; //acrescenta à string o ano da edição
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente
            {
                calculaNota(c.getNumero()); //calcula a nota deste concorrente
                if(c.getNota_total() == -1) //se o concorrente ainda não tiver os 4 pratos avaliados
                {
                    display.setText("\n\n\nNem todos os concorrentes foram avaliados");
                    sleep(2500);
                    display.setText("\n\n\nA edicao do ano " + procuraConcorrente(c.getNumero()) + " esta incompleta!\n\nPressione Voltar para voltar atras!");
                    this.menu = 15;
                    return;
                }
                else if(c.getNota_total() > nota) //se o concorrente já tiver a nota_total (4 pratos avaliados)
                    nota = c.getNota_total(); //atualiza o valor de 'nota' com a nota_total do concorrente
            }
            try
            {
                Concorrente c1 = e.getConcorrentes().get(procuraNota(e, nota)); //guarda em c1 o concorrente desta edição com aquela nota
                
                //acrescenta à string o nº, sexo, nome, idade e nota_total do concorrente
                vencedores += c1.getNumero() + "  " + c1.getSexo() + "  " + c1.getNome() + "  " + c1.getIdade() + "  " + c1.getNota_total() + "\n";
            }
            catch (NullPointerException npe)
            {
                display.setText("\n\n\nNao existem concorrentes em registo na edicao do ano " + e.getAno() + "!\n\nPressione Voltar para voltar atras!");
                this.menu = 15;
                return;
            }
        }
        display.setText(vencedores); //coloca no display a sting 'vencedores'
        this.menu = 15;
    }
    
    //coloca no display os resultados da procura de edicoes
    public void procuraEdicoes(int menu, String dado, String criterio) throws IOException
    {
        display.setText(consultaEdicoes(dado, criterio)); //coloca no display a string que ConsultaEdicoes retorna
        this.menu = menu;
        conta = 1;
    }
    
    //coloca no display os resultados da procura de concorrentes
    public void procuraConcorrentes(int menu, String dado, String criterio) throws IOException
    {
        display.setText(consultaConcorrentes(dado, criterio)); //coloca no display a string que consultaConcorrentes retorna
        this.menu = menu;
        conta = 1;
    }
    
     //coloca no display os resultados da procura de pratos
    public void procuraPratos(int menu, String dado, String criterio) throws IOException
    {
        display.setText(consultaPratos(dado, criterio)); //coloca no display a string que consultaPratos retorna
        this.menu = menu;
        conta = 1;
    }
    
    //verifica que os duelos de uma dada edicao sao disputados por concorrentes de sexos opostos
    public boolean verificaPratosDueloSexoOposto(Edicao e, String sexo){
        boolean cheio = false;
        int duelos_existentes = 0;
        
        for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente da edição
        {
            if(!c.getSexo().toLowerCase().equals(sexo.toLowerCase())) //se o concorrente for do sexo oposto
            {
                for(Prato p : c.getPratos().values()) //para cada prato do concorrente
                {
                    if(p.isDuelo()) //se o prato for de duelo
                        duelos_existentes++; //incrementa duelos_existentes
                }
            }
        }
        
        if(duelos_existentes==4) //se duelos_existentes chegar a 4 significa que todos os concorrentes
            cheio=true;          //do sexo oposto ja têm pratos de duelo (está "cheio")
        
        return cheio;
    }
    
    //metodo chamado com o pressionar do botao 1
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(menu == 2) //se estiver neste menu
            apresentaMenuInsiraEdicao(7); //apresenta o menu insira edicao
        if(menu == 1) //se estiver neste menu
            apresentaMenuEdicoes(4); //apresenta o menu edicoes
        if(menu == 0) //se estiver neste menu
            apresentaMenuVerDados(1); // apresenta o menu ver dados
    }//GEN-LAST:event_b1ActionPerformed

    //metodo chamado com o pressionar do botao executar
    private void bexecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexecutarActionPerformed
        if(menu == -1) //se estiver no estado inicial                                                                              
            apresentaMenuPrincipal(0); //apresenta o menu principal
    }//GEN-LAST:event_bexecutarActionPerformed

    //metodo chamado com o pressionar do botao sair
    private void bsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsairActionPerformed
        try //tenta
        {
            escreverEdicoes(); //escreve no ficheiro edicoes os dados atualizados
            escreverConcorrentes(); //escreve no ficheiro concorrentes os dados atualizados
            escreverPratos(); //escreve no ficheiro pratos os dados atualizados
            System.exit(0); //sai do programa
        } 
        catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_bsairActionPerformed

    //metodo chamado com o pressionar do botao voltar
    private void bvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvoltarActionPerformed
        conta = 1; //coloca a variavel de contagem a 1
        if(menu == 1 || menu == 2 || menu == 3) //se estiver num destes menus
            apresentaMenuPrincipal(0); //apresenta o menu principal
        if(menu == 4 || menu == 5 || menu == 6 || menu == 13 || menu == 15) //se estiver num destes menus
            apresentaMenuVerDados(1); //apresenta o menu ver dados
        if(menu == 7 || menu == 8 || menu == 9 || menu == 16 || menu == 17) //se estiver num destes menus
            apresentaMenuInserirDados(2); //apresenta o menu inserir dados
        if(menu == 10) //se estiver este menu
            apresentaMenuEdicoes(4); //apresenta o menu edicoes
        if(menu == 11) //se estiver este menu
            apresentaMenuConcorrentes(5); //apresenta o menu concorrentes
        if(menu == 12) //se estiver este menu
            apresentaMenuPratos(6); //apresenta o menu pratos
        if(menu == 14) //se estiver este menu
            apresentaMenuPenalizacoes(13); //apresenta o menu penalizacoes
    }//GEN-LAST:event_bvoltarActionPerformed

    //metodo chamado com o pressionar do botao 2
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(menu == 2) //se estiver no menu inserir dados
            apresentaMenuInsiraConcorrente(8); //apresenta o menu insira concorrente
        if(menu == 1) //se estiver no menu ver dados
            apresentaMenuConcorrentes(5); //apresenta o menu concorrentes
        if(menu == 0) //se estiver no menu principal
            apresentaMenuInserirDados(2); //apresenta o menu inserir dados
    }//GEN-LAST:event_b2ActionPerformed

    //metodo chamado com o pressionar do botao 3
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        if(menu == 2) //se estiver no menu inserir dados
            apresentaMenuInsiraPrato(9); //apresenta o menu insira prato
        if(menu == 1) //se estiver no menu ver dados
            apresentaMenuPratos(6); //apresenta o menu pratos
    }//GEN-LAST:event_b3ActionPerformed

    //metodo do campo de dados
    private void novosdadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novosdadosActionPerformed
        
    }//GEN-LAST:event_novosdadosActionPerformed

    //metodo chamado com o pressionar do botao OK
    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed

        if(menu == 16) //se esta no menu insira notas
        {
            if(conta == 7) //nota chef
            {
                dados7 = novosdados.getText(); //guarda em dados7 a nota do chef
                novosdados.setText("");
                Prato p = edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getPratos().get(dados3); //p guarda o prato com o nome em dados3
                if(dados7.matches("[0-9]+") && !dados7.matches("[a-zA-Z]+")) //se o input tiver numeros e nao tiver letras
                {
                    if(p.isDuelo()) //se for de duelo
                    {
                        switch (procuraPratoDuelo(edicoes.get(Integer.parseInt(dados1)), dados3)) { //retorna a nota do prato de duelo adversario (ou -2 se nao encontrar - nao acontece pois procuraPratoDuelo so e chamada quando existe)
                            case 10: //se a nota desse prato for 10
                                if(Integer.parseInt(dados7) == 0) //a deste tem de ser 0
                                {
                                    display.insert(dados7, 530); //coloca no ecra o input do utilizador
                                    sleep(1000); //espera 1s
                                    double pesoChef = edicoes.get(Integer.parseInt(dados1)).getPesoChef(); //guarda em pesoChef o peso do chef desta edicao (se nao tiver entao e 0.0)
                                    double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0)*(1-pesoChef)+Integer.parseInt(dados7)*pesoChef; //calcula a nota final do prato com os dados obtidos
                                    p.setNota(nota); //atualiza a nota do prato
                                    display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apaga do display "Nota Chef: ", colocando a confirmacao de sucesso
                                    sleep(2000); //espera 2s
                                    conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                                    apresentaMenuPrincipal(0); //apresenta o menu principal
                                    return;
                                }
                                else //se nao receber input 0
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 0 pois o seu adversario obteve 10!", 503, 600); //apresenta mensagem de erro
                                    sleep(2500); //espera 2.5s
                                    display.replaceRange("Nota Chef: ", 503, 600); //apresenta novamente "Nota Chef: "
                                }   break;
                            case 0: //se a nota desse prato for 0
                                if(Integer.parseInt(dados7) == 10) //a deste tem de ser 10
                                {
                                    display.insert(dados7, 530); //coloca no ecra o input do utilizador
                                    sleep(1000); //espera 1s
                                    double pesoChef = edicoes.get(Integer.parseInt(dados1)).getPesoChef(); //guarda em pesoChef o peso do chef desta edicao (se nao tiver entao e 0.0)
                                    double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0)*(1-pesoChef)+Integer.parseInt(dados7)*pesoChef; //calcula a nota final do prato com os dados obtidos
                                    p.setNota(nota); //atualiza a nota do prato
                                    display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apaga do display "Nota Chef: ", colocando a confirmacao de sucesso
                                    sleep(2000); //espera 2s
                                    conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                                    apresentaMenuPrincipal(0); //apresenta o menu principal
                                    return;
                                }
                                else //se nao receber input 10
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 10 pois o seu adversario obteve 0!", 503, 600); //apresenta mensagem de erro
                                    sleep(2500); //espera 2.5s
                                    display.replaceRange("Nota Chef: ", 503, 600); //apresenta novamente "Nota Chef: "
                                }   break;
                            default:
                                if(Integer.parseInt(dados7) == 0 || Integer.parseInt(dados7) == 10) //se ainda nao tiver outro prato destes atribuido entao este pode ter 0 ou 10
                                {
                                    display.insert(dados7, 530); //coloca no ecra o input do utilizador
                                    sleep(1000); //espera 1s
                                    double pesoChef = edicoes.get(Integer.parseInt(dados1)).getPesoChef(); //guarda em pesoChef o peso do chef desta edicao (se nao tiver entao e 0.0)
                                    double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0)*(1-pesoChef)+Integer.parseInt(dados7)*pesoChef; //calcula a nota final do prato com os dados obtidos
                                    p.setNota(nota); //atualiza a nota do prato
                                    display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apaga do display "Nota Chef: ", colocando a confirmacao de sucesso
                                    sleep(2000); //espera 2s
                                    conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                                    apresentaMenuPrincipal(0);
                                    return;
                                }
                                else //se nao receber 0 ou 10
                                {
                                    display.replaceRange("A nota de um prato do duelo tem de ser 0 ou 10!", 503, 600); //apresenta mensagem de erro
                                    sleep(2500); //espera 2.5s
                                    display.replaceRange("Nota Chef: ", 503, 600);
                                }   break;
                        }
                    }
                    else //se nao for de duelo
                    {
                        if(Integer.parseInt(dados7) >= 0 && Integer.parseInt(dados7) <= 10) //se a nota estiver entre 0 e 10
                        {
                            display.insert(dados7, 530); //coloca no ecra o input do utilizador
                            sleep(1000); //espera 1s
                            double pesoChef = edicoes.get(Integer.parseInt(dados1)).getPesoChef(); //pesoChef guarda o peso do chef desta edicao
                            double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0)*(1-pesoChef)+Integer.parseInt(dados7)*pesoChef; //calcula a nota final do prato
                            p.setNota(nota); //atualiza a nota
                            display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apaga do display "Nota Chef: ", colocando a confirmacao de sucesso
                            sleep(2000); //espera 2s
                            conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                            apresentaMenuPrincipal(0); //apresenta o menu principal
                            return;
                        }
                        else //se o input nao estiver entre 0 e 10
                        {
                            display.replaceRange("A nota tem de estar entre 0 e 10!", 503, 600);
                            sleep(2500); //espera 2.5s
                            display.replaceRange("Nota Chef: ", 503, 600);
                        }
                    }
                }
                else //se o input nao tiver numeros ou tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 530, 600);
                    sleep(2500); //espera 2.5s
                    display.replaceRange("Nota Chef: ", 503, 600);
                }
            }
            if(conta == 6) //nota jurado 3
            {
                dados6 = novosdados.getText(); //guarda em dados6 o input
                novosdados.setText("");
                Prato p = edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getPratos().get(dados3); //p fica com o prato com o nome indicado por dados3 (prato ja criado)
                if(dados6.matches("[0-9]+") && !dados6.matches("[a-zA-Z]+")) //se o input tiver numeros e nao tiver letras
                {
                    if(p.isDuelo()) //se for de duelo
                    {
                        switch (procuraPratoDuelo(edicoes.get(Integer.parseInt(dados1)), dados3)) { //retorna a nota do prato de duelo adversario (ou -2 se nao encontrar - nao acontece pois procuraPratoDuelo so e chamada quando existe)
                            case 10: //se a nota desse prato for 10
                                if(Integer.parseInt(dados6) == 0) //a deste tem de ser 0
                                {
                                    display.insert(dados6, 530); //coloca no ecra o input do utilizador
                                    sleep(1000); //espera 1s
                                    if(edicoes.get(Integer.parseInt(dados1)).getPesoChef() != 0) //se tiver chef
                                    {
                                        display.replaceRange("Nota Chef: ", 503, 600); //pede a nota do chef
                                        conta++; //incrementa a contagem
                                    }
                                    else //se nao tiver chef
                                    {
                                        double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0); //calcula a nota sem chef
                                        p.setNota(nota); //atualiza a nota do prato
                                        display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apresenta mensagem de sucesso
                                        sleep(2000); //espera 2s
                                        conta = 1; //coloca a variavel de contagem novamente a 1
                                        apresentaMenuPrincipal(0); //apresenta o menu principal
                                        return;
                                    }
                                }
                                else //se nao receber input 0
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 0 pois o seu adversario obteve 10!", 503, 600); //apresenta mensagem de erro
                                    sleep(2500); //espera 2.5s
                                    display.replaceRange("Nota jurado 3: ", 503, 600); //apresenta novamente "Nota jurado 3: "
                                }   break;
                            case 0: //se a nota desse prato for 0
                                if(Integer.parseInt(dados6) == 10) //a deste tem de ser 10
                                {
                                    display.insert(dados6, 530); //coloca no ecra o input do utilizador
                                    sleep(1000); //espera 1s
                                    if(edicoes.get(Integer.parseInt(dados1)).getPesoChef() != 0) //se tiver chef
                                    {
                                        display.replaceRange("Nota Chef: ", 503, 600); //pede a nota do chef
                                        conta++; //incrementa a contagem
                                    }
                                    else //se nao tiver chef
                                    {
                                        double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0); //calcula a nota sem chef
                                        p.setNota(nota); //atualiza a nota do prato
                                        display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apresenta mensagem de sucesso
                                        sleep(2000); //espera 2s
                                        conta = 1; //coloca a variavel de contagem novamente a 1
                                        apresentaMenuPrincipal(0); //apresenta o menu principal
                                        return;
                                    }
                                }
                                else //se nao receber input 10
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 10 pois o seu adversario obteve 0!", 503, 600); //apresenta mensagem de erro
                                    sleep(2500); //espera 2.5s
                                    display.replaceRange("Nota jurado 3: ", 503, 600); //apresenta novamente "Nota jurado 3: "
                                }   break;
                            default: 
                                if(Integer.parseInt(dados6) == 0 || Integer.parseInt(dados6) == 10) //se ainda nao tiver outro prato destes atribuido entao este pode ter 0 ou 10
                                {
                                    display.insert(dados6, 530); //coloca no ecra o input do utilizador
                                    sleep(1000); //espera 1s
                                    if(edicoes.get(Integer.parseInt(dados1)).getPesoChef() != 0) //se tiver chef
                                    {
                                        display.replaceRange("Nota Chef: ", 503, 600); //pede a nota do chef
                                        conta++; //incrementa a contagem
                                    }
                                    else //se nao tiver chef
                                    {
                                        double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0); //calcula a nota sem chef
                                        p.setNota(nota); //atualiza a nota do prato
                                        display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apresenta mensagem de sucesso
                                        sleep(2000); //espera 2s
                                        conta = 1; //coloca a variavel de contagem novamente a 1
                                        apresentaMenuPrincipal(0); //apresenta o menu principal
                                        return;
                                    }
                                }
                                else //se nao receber 0 ou 10
                                {
                                    display.replaceRange("A nota de um prato do duelo tem de ser 0 ou 10!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 3: ", 503, 600);
                                }   break;
                        }
                    }
                    else //se nao for de duelo
                    {
                        if(Integer.parseInt(dados6) >= 0 && Integer.parseInt(dados6) <= 10) //se a nota estiver entre 0 e 10
                        {
                            display.insert(dados6, 530); //coloca no ecra o input do utilizador
                            sleep(1000); //espera 1s
                            if(edicoes.get(Integer.parseInt(dados1)).getPesoChef() != 0) //se tiver chef
                            {
                                display.replaceRange("Nota Chef: ", 503, 600); //pede a nota do chef
                                conta++; //incrementa a contagem
                            }
                            else //se nao tiver chef
                            {
                                double nota = ((Integer.parseInt(dados4)+Integer.parseInt(dados5)+Integer.parseInt(dados6))/3.0); //calcula a nota final do prato
                                p.setNota(nota); //atualiza a nota do prato
                                display.replaceRange("Nota atribuida com sucesso!", 503, 600); //apresenta mensagem de sucesso
                                sleep(2000); //espera 2s
                                conta = 1; //coloca a variavel de contagem novamente a 1
                                apresentaMenuPrincipal(0); //apresenta o menu principal
                                return;
                            }
                        }
                        else //se nao receber uma nota entre 0 e 10
                        {
                            display.replaceRange("A nota tem de estar entre 0 e 10!", 503, 600); //apresenta mensagem de erro
                            sleep(2500); //espera 2.5s
                            display.replaceRange("Nota jurado 3: ", 503, 600); //apresenta novamente "Nota jurado 3: "
                        }
                    }
                }
                else //se o input nao tiver numeros ou tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 503, 600);
                    sleep(2500);
                    display.replaceRange("Nota jurado 3: ", 503, 600);
                }
            }
            if(conta == 5) //nota jurado 2
            {
                dados5 = novosdados.getText();
                novosdados.setText("");
                Prato p = edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getPratos().get(dados3);
                if(dados5.matches("[0-9]+") && !dados5.matches("[a-zA-Z]+"))
                {
                    if(p.isDuelo())
                    {
                        switch (procuraPratoDuelo(edicoes.get(Integer.parseInt(dados1)), dados3)) {
                            case 10:
                                if(Integer.parseInt(dados5) == 0)
                                {
                                    display.insert(dados5, 530);
                                    sleep(1000);
                                    conta++;
                                    display.replaceRange("Nota jurado 3: ", 503, 600);
                                }
                                else
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 0 pois o seu adversario obteve 10!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 2: ", 503, 600);
                                }   break;
                            case 0:
                                if(Integer.parseInt(dados5) == 10)
                                {
                                    display.insert(dados5, 530);
                                    sleep(1000);
                                    conta++;
                                    display.replaceRange("Nota jurado 3: ", 503, 600);
                                }
                                else
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 10 pois o seu adversario obteve 0!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 2: ", 503, 600);
                                }   break;
                            default:
                                if(Integer.parseInt(dados5) == 0 || Integer.parseInt(dados5) == 10)
                                {
                                    display.insert(dados5, 530);
                                    sleep(1000);
                                    conta++;
                                    display.replaceRange("Nota jurado 3: ", 503, 600);
                                }
                                else
                                {
                                    display.replaceRange("A nota de um prato do duelo tem de ser 0 ou 10!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 2: ", 503, 600);
                                }   break;
                        }
                    }
                    else
                    {
                        if(Integer.parseInt(dados5) >= 0 && Integer.parseInt(dados5) <= 10)
                        {
                            display.insert(dados5, 530);
                            sleep(1000);
                            conta++;
                            display.replaceRange("Nota jurado 3: ", 503, 600);
                        }
                        else
                        {
                            display.replaceRange("A nota tem de estar entre 0 e 10!", 503, 600);
                            sleep(2500);
                            display.replaceRange("Nota jurado 2: ", 503, 600);
                        }
                    }
                }
                else
                {
                    display.replaceRange("Dados Invalidos!", 503, 600);
                    sleep(2500);
                    display.replaceRange("Nota jurado 2: ", 503, 600);
                }
            }
            if(conta == 4) //nota jurado 1
            {
                dados4 = novosdados.getText();
                novosdados.setText("");
                Prato p = edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getPratos().get(dados3);
                if(dados4.matches("[0-9]+") && !dados4.matches("[a-zA-Z]+"))
                {
                    if(p.isDuelo())
                    {
                        switch (procuraPratoDuelo(edicoes.get(Integer.parseInt(dados1)), dados3)) {
                            case 10:
                                if(Integer.parseInt(dados4) == 0)
                                {
                                    display.insert(dados4, 530);
                                    sleep(1000);
                                    conta++;
                                    display.replaceRange("Nota jurado 2: ", 503, 600);
                                }
                                else
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 0 pois o seu adversario obteve 10!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 1: ", 503, 600);
                                }   break;
                            case 0:
                                if(Integer.parseInt(dados4) == 10)
                                {
                                    display.insert(dados4, 530);
                                    sleep(1000);
                                    conta++;
                                    display.replaceRange("Nota jurado 2: ", 503, 600);
                                }
                                else
                                {
                                    display.replaceRange("A nota deste prato do duelo tem de ser 10 pois o seu adversario obteve 0!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 1: ", 503, 600);
                                }   break;
                            default:
                                if(Integer.parseInt(dados4) == 0 || Integer.parseInt(dados4) == 10)
                                {
                                    display.insert(dados4, 530);
                                    sleep(1000);
                                    conta++;
                                    display.replaceRange("Nota jurado 2: ", 503, 600);
                                }
                                else
                                {
                                    display.replaceRange("A nota de um prato do duelo tem de ser 0 ou 10!", 503, 600);
                                    sleep(2500);
                                    display.replaceRange("Nota jurado 1: ", 503, 600);
                                }   break;
                        }
                    }
                    else
                    {
                        if(Integer.parseInt(dados4) >= 0 && Integer.parseInt(dados4) <= 10)
                        {
                            display.insert(dados4, 530);
                            sleep(1000);
                            conta++;
                            display.replaceRange("Nota jurado 2: ", 503, 600);
                        }
                        else
                        {
                            display.replaceRange("A nota tem de estar entre 0 e 10!", 503, 600);
                            sleep(2500);
                            display.replaceRange("Nota jurado 1: ", 503, 600);
                        }
                    }
                }
                else
                {
                    display.replaceRange("Dados Invalidos!", 503, 600);
                    sleep(2500);
                    display.replaceRange("Nota jurado 1: ", 503, 600);
                }
            }
            if(conta == 3) //nome do prato
            {
                dados3 = novosdados.getText();
                novosdados.setText("");
                if(!dados3.matches("[0-9]+")) //se o input nao tem numeros
                {
                    if(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getPratos().keySet().contains(dados3)) //se este prato pertence ao concorrente com este numero
                    {
                        display.insert(dados3, 530); //coloca no ecra o input do utilizador
                        sleep(1000); //espera 1s
                        conta++; //incrementa a contagem
                        display.replaceRange("Nota jurado 1: ", 503, 600);
                    }
                    else //se nao pertence
                    {
                        display.replaceRange("Este concorrente nao tem o prato especificado!", 503, 600); //apresenta mensagem de erro
                        sleep(2500); //espera 2.5s
                        display.replaceRange("Nome do Prato: ", 503, 600);
                    }
                }
                else //se o input tiver numeros
                {
                    display.replaceRange("Dados Invalidos!", 503, 600); //apresenta mensagem de erro
                    sleep(2500); //espera 2.5s
                    display.replaceRange("Nome do Prato: ", 503, 600);
                }
            }
            if(conta == 2) //numero do concorrente
            {
                dados2 = novosdados.getText();
                novosdados.setText("");
                if(dados2.matches("[0-9]+") && !dados2.matches("[a-zA-Z]+")) //se o input tem numeros e nao tem letras
                {
                    if(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().keySet().contains(Integer.parseInt(dados2))) //se esta edicao contem um concorrente com este numero
                    {
                        display.insert(dados2, 526); //coloca no ecra o input
                        sleep(1000); //espera 1s
                        conta++; //incrementa a contagem
                        display.replaceRange("Nome do Prato: ", 503, 600);
                    }
                    else //se nao contem
                    {
                        display.replaceRange("Nao existe um concorrente com o numero especificado!", 503, 600); //apresenta mensagem de erro
                        sleep(2500);
                        display.replaceRange("Numero do Concorrente: ", 503, 600);
                    }
                }
                else //se nao tem numeros ou tem letras
                {
                    display.replaceRange("Dados Invalidos!", 503, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Numero do Concorrente: ", 503, 600);
                }
            }
            if(conta == 1) //ano da edicao
            {
                dados1 = novosdados.getText(); //guarda em dados 1 o ano
                novosdados.setText("");
                if(dados1.matches("[0-9]+") && !dados1.matches("[a-zA-Z]+")) //se o input tem numeros e nao tem letras
                {
                    if ( !edicoes.containsKey(Integer.parseInt(dados1))) //se nao existe uma edicao no treemap com a chave guardada em dados1 (converte string para int primeiro) entao ja existe uma edicao do ano especificado
                    {
                        display.replaceRange("Nao existe uma edicao com o ano introduzido!", 503, 600); //apaga "Ano da edicao: " e apresenta uma mensagem de erro e espera por um input valido
                        sleep(2500);
                        display.replaceRange("Ano da edicao: ", 503, 600); // volta a apresentar "Ano da edicao: ", apagando a mensagem de erro
                    }
                    else //se existir
                    {
                        if(edicoes.get(Integer.parseInt(dados1)).getPesoChef() == 0) //se nao existir chefe nesta edicao
                        {
                            display.insert(dados1, 518); //coloca no ecra o input do utilizador
                            sleep(1000); //espera 1s
                            conta++; //incrementa o contador, aceitando o ano
                            display.replaceRange("Esta edicao nao tem chefe logo so serao pedidas as notas dos 3 jurados!", 503, 600);
                            sleep(2000); //espera 2s
                            display.replaceRange("Numero do Concorrente: ", 503, 600);
                        }
                        else //se esta edicao tiver chefe
                        {
                            display.insert(dados1, 518);
                            sleep(1000);
                            conta++; //incrementa o contador, aceitando o ano
                            display.replaceRange("Esta edicao tem chefe logo serao pedidas as 4 notas!", 503, 600);
                            sleep(2000);
                            display.replaceRange("Numero do Concorrente: ", 503, 600); //apresenta o proximo input pretendido, apagando o anterior
                        }
                    }
                }
                else //se o input nao tiver numeros ou tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 503, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Ano da edicao: ", 503, 600);
                }
            }
        }
        if(menu == 13) //se esta no menu consultar penalizacoes
        {
            dados1 = novosdados.getText(); //espera por um numero de concorrente
            novosdados.setText("");
            if(!dados1.matches("[a-zA-Z]+") && dados1.matches("[0-9]+")) //se o input tiver numeros e nao tiver letras
            {
                try //tenta calcular as penalizacoes do concorrente com este numero
                {
                    if(calculaPenalizacoes(Integer.parseInt(dados1)) == -1) //se falhar retorna
                        return;
                }
                catch(NullPointerException npe) //se nao existir
                {
                    display.replaceRange("Nao existe um concorrente com este numero!", 600, 700); //apresenta mensagem de erro
                    sleep(2500); //espera 2.5s
                    display.replaceRange("", 600, 700);
                    return; //retorna
                }
                apresentaPenalizacoes(14, Integer.parseInt(dados1)); //se calcular com sucesso entao apresenta as penalizacoes
            }
        }
        if(menu == 4) //se estiver no menu consultar edicoes
        {
            if(conta == 2) //dado de procura
            {
                dados1 = novosdados.getText();
                novosdados.setText("");
                display.insert(dados1, 464);
                sleep(1000);
                try { procuraEdicoes(10, dados1, dados); } //tenta procurar por edicoes segundo o criterio e dado especificados
                catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); }
                return;
            }
            if(conta == 1) //criterio de procura
            {
                dados = novosdados.getText();
                novosdados.setText("");
                switch (dados.toLowerCase()) { //se o criterio de procura for igual a
                    case "ano": //ano, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "cidade": //cidade, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "peso": //peso, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "todas": //todas, apresenta todas as edicoes
                        try { apresentaEdicoes(10); } 
                        catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); }
                        break;
                    default: //se o input nao corresponder a nenhum destes criterios
                        display.replaceRange("Opcao invalida!", 650, 700); //apresenta mensagem de erro
                        sleep(2500); //espera 2.5s
                        display.replaceRange(" ", 620, 700);
                        break;
                }
            }
        }
        if(menu == 5) //se estiver no menu consultar concorrentes
        {
            if(conta == 2) //dado de procura
            {
                dados1 = novosdados.getText();
                novosdados.setText("");
                display.insert(dados1, 479);
                sleep(1000);
                try { procuraConcorrentes(11, dados1, dados); } //tenta procurar por concorrentes segundo o criterio e dado especificados
                catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); } 
                return;
            }
            if(conta == 1) //criterio de procura
            {
                dados = novosdados.getText();
                novosdados.setText("");
                switch (dados.toLowerCase()) { //se o criterio de procura for igual a
                    case "nome": //nome, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "numero": //numero, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "idade": //idade, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "sexo": //sexo, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "edicao": //edicao, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "nota": //nota, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "todos": //todos, apresenta todos os concorrentes
                        try { apresentaConcorrentes(11); } //tenta apresentar todos os concorrentes
                        catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); }
                        break;
                    default: //se o input nao corresponder a nenhum destes criterios
                        display.replaceRange("Opcao invalida!", 650, 700); //apresenta mensagem de erro
                        sleep(2500); //espera 2.5s
                        display.replaceRange("", 639, 700);
                        break;
                }
            }
        }
        if(menu == 6) //se estiver no menu consultar pratos
        {
            if(conta == 2) //dado de procura
            {
                dados1 = novosdados.getText();
                novosdados.setText("");
                display.insert(dados1, 464);
                sleep(1000);
                try { procuraPratos(12, dados1, dados); } //tenta procurar por pratos segundo o criterio e dado especificados
                catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); }
                return;
            }
            if(conta == 1)
            {
                dados = novosdados.getText();
                novosdados.setText("");
                switch (dados.toLowerCase()) { //se o criterio de procura for igual a
                    case "numero": //numero, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "nome": //nome, entao incrementa a contagem e apresenta o menu procurar dado 
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "tipo": //tipo, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "regiao": //regiao, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "tempo": //tempo, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "duelo": //duelo, entao incrementa a contagem e apresenta o menu procurar dado
                        conta++;
                        apresentaMenuProcurarDado();
                        break;
                    case "todos": //todos, apresenta todos os pratos
                        try { apresentaPratos(12); } //tenta apresentar todos os pratos
                        catch (IOException ex) { Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex); }
                        break;
                    default: //se o input nao corresponder a nenhum destes criterios
                        display.replaceRange("Opcao invalida!", 714, 750); //apresenta mensagem de erro
                        sleep(2500);
                        display.replaceRange("", 714, 750);
                        break;
                }
            }
        }
        if(menu == 7) //se estiver no menu inserir edicoes
        {    
            if(conta == 4) //peso do chefe
            {
                dados4 = novosdados.getText();
                novosdados.setText("");
                if(dados4.contains(".") && !dados4.contains(",")) //se o input usa '.' para simbolo decimal e nao ','
                {
                    if( Double.parseDouble(dados4) > 0 && Double.parseDouble(dados4) < 0.6) //se esta entre 0,1 e 0,5
                    {
                        display.insert(dados4, 505);
                        sleep(1000);
                        Edicao edicao = new Edicao(dados2, Integer.parseInt(dados1), Double.parseDouble(dados4)); //cria nova edicao com os parametros cidade, ano e pesochefe, respetivamente
                        edicoes.put(Integer.parseInt(dados1), edicao); //adiciona ao treemap edicoes a edicao acabada de criar cuja chave e o seu ano
                        display.replaceRange("                          ", 451, 477); //apaga do display "Dados a da edicao a inserir: ", colocando a branco
                        display.replaceRange("Edicao inserida com sucesso!", 479, 600); //coloca a confirmacao de sucesso
                        sleep(2000); //espera 2s
                        conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                        display.setText(" "); //apaga todo o display
                        apresentaMenuPrincipal(0); //coloca no display o Menu Principal
                        return;
                    }
                    else //se for menor que 0,1 ou maior que 0,5
                    {
                        display.replaceRange("Opcao invalida! O valor tem de estar entre 0.1 e 0.5!", 479, 600); //apresenta mensagem de erro
                        sleep(2500);
                        display.replaceRange("Peso do chefe (0.x): ", 479, 600);
                    }
                }
                else //se nao contem um '.' ou contem uma ','
                {
                    display.replaceRange("Opcao invalida! Use '.' para o simbolo decimal!", 479, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Peso do chefe (0.x): ", 479, 600);
                }
            }
            if(conta == 3) // avaliacao do chefe
            {
                dados3 = novosdados.getText();
                novosdados.setText("");
                boolean avaliacao_sim = false; //criacao e inicializacao de uma variavel local
                boolean avaliacao_nao = false; //criacao e inicializacao de uma variavel local
                
                if( dados3.toLowerCase().equals("s") ) //se o input for igual a 's'
                    avaliacao_sim = true; //avaliacao_sim fica true
                else if( dados3.toLowerCase().equals("n") ) //se o input for igual a 'n'
                    avaliacao_nao = true; //avaliacao_nao fica true
                
                if( avaliacao_sim ) //se a resposta for 's' (valida)
                {
                    display.insert("Sim", 505); //insere no display a frente de "Avaliacao do chefe (s/n): " a resposta submetida
                    sleep(1000);
                    conta++; //incrementa a contagem pedindo agora o peso do chef
                    display.replaceRange("Peso do chefe (0.x): ", 479, 600); //apaga do display "Avaliacao do chefe (s/n): ", colocando a confirmacao de sucesso
                }
                else if( avaliacao_nao ) //se a resposta for 'n' (valida)
                {
                    display.insert("Nao", 505);
                    sleep(1000);
                    Edicao edicao = new Edicao(dados2, Integer.parseInt(dados1), 0); //cria nova edicao com os parametros cidade, ano e pesochefe, respetivamente (com o peso do chef a 0)
                    edicoes.put(Integer.parseInt(dados1), edicao); //adiciona ao treemap edicoes a edicao acabada de criar cuja chave e o seu ano
                    display.replaceRange("                          ", 451, 477); //apaga do display "Dados a da edicao a inserir: ", colocando a branco
                    display.replaceRange("Edicao inserida com sucesso!", 479, 600); //coloca a confirmacao de sucesso
                    sleep(2000); //espera 2s
                    conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                    apresentaMenuPrincipal(0); //apresenta o menu principal
                    return;
                }
                else if( !(avaliacao_sim  || avaliacao_nao ) ) //se nao for valida
                {
                    display.replaceRange("Opcao invalida!", 479, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Avaliacao do chefe (s/n): ", 479, 600);
                }
            }            
            if(conta == 2) // cidade
            {
                dados2 = novosdados.getText(); //guarda em dados2 a cidade
                novosdados.setText("");
                if(!dados2.matches("[0-9]+") && dados2.matches("[a-zA-Z]+")) //se o input nao tiver numeros e tiver letras
                {
                    display.insert(dados2, 494);
                    sleep(1000);
                    conta++; //incrementa a contagem, aceitando a cidade
                    display.replaceRange("Avaliacao do chefe (s/n): ", 479, 600);
                }
                else //se tiver numeros ou nao tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 479, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Cidade: ", 479, 600);
                }
            }
            if(conta == 1) // ano
            {
                dados1 = novosdados.getText(); //guarda em dados 1 o ano
                novosdados.setText("");
                if(dados1.matches("[0-9]+") && !dados1.matches("[a-zA-Z]+")) //se o input tiver numeros e nao tiver letras
                {
                    if ( edicoes.containsKey(Integer.parseInt(dados1))) //se existe uma edicao no treemap com a chave guardada em dados1 (converte string para int primeiro) entao ja existe uma edicao do ano especificado
                    {
                        display.replaceRange("Ja existe uma edicao com o ano introduzido!", 479, 600); //apaga "Ano da edicao: ", apresenta uma mensagem de erro e espera por um input valido
                        sleep(2500);
                        display.replaceRange("Ano da edicao: ", 479, 600); // volta a apresentar "Ano da edicao: ", apagando a mensagem de erro
                    }
                    else //se nao existir
                    {
                        display.insert(dados1, 494);
                        sleep(1000);
                        conta++; //incrementa o contador, aceitando o ano
                        display.replaceRange("Cidade: ", 479, 600); //apresenta o proximo input pretendido, apagando o anterior
                    }
                }
                else //se o input nao tiver numeros ou tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 479, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Ano da edicao: ", 479, 600);
                }
            }
        }
        if(menu == 8) //se estiver no menu inserir concorrentes
        {
            //Concorrente 1
            if(conta == 5) // idade
            {
                dados5 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados5.matches("[0-9]+") && !dados5.matches("[a-zA-Z]+")) //se o input tiver numeros e nao tiver letras
                {
                    display.insert(dados5, 505);
                    sleep(1000);
                    Concorrente c = new Concorrente(dados4, Integer.parseInt(dados2), Integer.parseInt(dados5), dados3, -1); //cria um novo concorrente que e inicializado com a nota a -1 (indicando q nao foi calculada)
                    edicoes.get(Integer.parseInt(dados1)).getConcorrentes().put(Integer.parseInt(dados2), c); //adiciona-o a edicao
                    display.replaceRange("                               ", 446, 477);
                    display.replaceRange("Concorrente inserido com sucesso!", 497, 600);
                    sleep(2000);
                    conta = 1; //coloca a contagem novamente a 1
                    apresentaMenuPrincipal(0); //apresenta o menu principal
                    return;
                }
                else //se o input nao tiver numeros ou tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 497, 600);
                    sleep(2500);
                    display.replaceRange("Idade: ", 497, 600);
                }
                return;
            }
            if(conta == 4) // nome
            {
                dados4 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(!dados4.matches("[0-9]+")) //se nao tiver numeros
                {
                    display.insert(dados4, 505);
                    sleep(1000);
                    conta++; //incrementa a contagem aceitando o nome
                    display.replaceRange("Idade: ", 497, 600);
                }
                else //se tiver numeros
                {
                    display.replaceRange("Dados Invalidos!", 497, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Nome: ", 497, 600);
                }
            }
            if(conta == 3) // sexo
            {
                dados3 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(!dados3.matches("[0-9]+") && dados3.matches("[a-zA-Z]+")) //se nao tem numeros e tem letras
                {
                    if(dados3.toLowerCase().equals("masculino") || dados3.toLowerCase().equals("feminino") ) //se o input for igual a "masculino" ou "feminino"
                    {
                        if( contaSexo(edicoes.get(Integer.parseInt(dados1)), dados3) ) //se ja existirem 4 concorrentes deste sexo nesta edicao
                        {
                            display.replaceRange("Ja existem quatro concorrentes do sexo " + dados3 + " nesta edicao!", 497, 600); //apresenta mensagem de erro
                            sleep(2500);
                            display.replaceRange("Sexo (Masculino/Feminino): ", 497, 600);
                        }
                        else //se nao existirem 4 entao este pode ser adicionado
                        {
                            display.insert(dados3, 545);
                            sleep(1000);
                            conta++; //incrementa a contagem aceitando o sexo
                            display.replaceRange("Nome: ", 497, 600);
                        }
                    }
                    else //se o input nao for uma das opcoes
                    {
                        display.replaceRange("Opcao Invalida!", 497, 600);
                        sleep(2500);
                        display.replaceRange("Sexo (Masculino/Feminino): ", 497, 600);
                    }
                }
                else //se tiver numeros ou nao tiver letras
                {
                    display.replaceRange("Dados Invalidos!", 497, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Sexo (Masculino/Feminino): ", 497, 600);
                }
                
            }
            if(conta == 2) // numero
            {
                dados2 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados2.matches("[0-9]+") && !dados2.matches("[a-zA-Z]+")) //se tem numeros e nao tem letras
                {
                    if(!edicoes.get(Integer.parseInt(dados1)).getConcorrentes().keySet().contains(Integer.parseInt(dados2)) && verificaConcorrenteUnico(Integer.parseInt(dados2))) //se este concorrente nao existem em nenhuma edicao
                    {
                        display.insert(dados2, 512);
                        sleep(1000);
                        conta++; //incrementa a contagem aceitando o numero
                        display.replaceRange("Sexo (Masculino/Feminino): ", 497, 600);
                    }
                    else //se existe
                    {
                        display.replaceRange("Ja existe um concorrente com o numero especificado!", 497, 600); //apresenta mensagem de erro
                        sleep(2500);
                        display.replaceRange("Numero: ", 497, 600);
                    }
                }
                else //se nao tem numeros ou tem letras
                {
                    display.replaceRange("Dados Invalidos!", 497, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Numero: ", 497, 600);
                }
            }
            if(conta == 1) // Edicao
            {

                dados1 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados1.matches("[0-9]+") && !dados1.matches("[a-zA-Z]+")) //se tem numeros e nao tem letras
                {
                    if(edicoes.keySet().contains(Integer.parseInt(dados1))) //se existe uma edicao deste ano
                    {
                        if(verificaConcorrentes(edicoes.get(Integer.parseInt(dados1)))) //se esta edicao ja tem 8 concorrentes
                        {
                            display.replaceRange("Esta edicao ja tem oito concorrentes!", 497, 600); //apresenta mensagem de erro
                            sleep(2500);
                            display.replaceRange("Ano da edicao: ", 497, 600);
                        }
                        else //se nao tiver 8 concorrentes
                        {
                            display.insert(dados1, 512);
                            sleep(1000);
                            conta++; //incrementa a contagem aceitando o ano
                            display.replaceRange("Numero: ", 497, 600);
                        }
                    }
                    else //se nao existe
                    {
                        display.replaceRange("Nao existe uma edicao com o ano especificado!", 497, 600); //apresenta mensagem de erro
                        sleep(2500);
                        display.replaceRange("Ano da edicao: ", 497, 600);
                    }
                }
                else //se nao tem numeros ou tem letras
                {
                    display.replaceRange("Dados Invalidos!", 497, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Ano da edicao: ", 497, 600);
                }
            }
        }
        if(menu == 9) //se estiver no menu inserir pratos
        {
            if(conta == 9) //substituir dados
            {
                dados9 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados9.toLowerCase().equals("s")) //se receber input 's'
                {
                    display.insert("Sim", 585);
                    sleep(1000);
                    Prato p = edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(pesquisaPrato(edicoes.get(Integer.parseInt(dados1)), dados3)).getPratos().get(dados3); //p fica com o prato ja existente com este nome
                    p.setTipo(dados4); //atualiza o tipo desse prato com o tipo deste
                    p.setRegiao(dados5); //atualiza a regiao desse prato com a regiao deste
                    p.setTempo(Double.parseDouble(dados6)); //atualiza o tempo desse prato com o tempo deste
                    if(p.getNota()==10) //se a nota desse prato for 10
                        p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), true, 0); //cria este prato com nota 0
                    else if(p.getNota()==0) //se a nota desse prato for 0
                        p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), true, 10); //cria este prato com nota 10
                    else
                        p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), true); // cria este prato com nota inicializada a -1
                    edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(p); //adiciona o prato ao concorrente
                    display.replaceRange("                        ", 451, 477);
                    display.replaceRange("Prato inserido com sucesso!", 477, 600);
                    sleep(2000);
                    conta = 1; //coloca novamente a variavel de contagem a 1
                    apresentaMenuPrincipal(0); //apresenta o menu principal
                    return;
                }
                else if(dados9.toLowerCase().equals("n")) //se receber input 'n'
                {
                    display.insert("Nao", 585);
                    sleep(1000);
                    Prato p = edicoes.get( Integer.parseInt(dados1) ).getConcorrentes().get(pesquisaPrato(edicoes.get(Integer.parseInt(dados1)), dados3)).getPratos().get(dados3); //p fica com o prato ja existente com este nome
                    dados4 = p.getTipo(); //atualiza o tipo deste prato com o tipo desse
                    dados5 = p.getRegiao(); //atualiza a regiao deste prato com a regiao desse
                    dados6 = Double.toString(p.getTempo()); //atualiza o tempo deste prato com o tempo desse
                    if(p.getNota()==10) //se a nota desse prato for 10
                        p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), true, 0); //cria este prato com nota 0
                    else if(p.getNota()==0) //se a nota desse prato for 0
                        p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), true, 10); //cria este prato com nota 10
                    else
                        p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), true); // cria este prato com nota inicializada a -1
                    edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(p); //adiciona o prato ao concorrente
                    display.replaceRange("                        ", 451, 477);
                    display.replaceRange("Prato inserido com sucesso!", 477, 600);
                    sleep(2000);
                    conta = 1; //coloca novamente a variavel de contagem a 1
                    apresentaMenuPrincipal(0); //apresenta o menu principal
                    return;
                }
                else //se nao receber 's' ou 'n'
                {
                    display.replaceRange("Opcao invalida!", 479, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Pretende ficar com estes dados (SIM - o outro e atualizado ; NAO - este e atualizado) (s/n): ", 479, 600);
                }
            }
            if(conta == 8) // duelo
            {
                dados8 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                boolean duelo_sim = false; //cria e inicializa uma variavel local como false
                boolean duelo_nao = false; //cria e inicializa uma variavel local como false
                if( dados8.toLowerCase().equals("s") ) //se o input for igual a 's'
                    duelo_sim = true; //duelo_sim fica true
                else if( dados8.toLowerCase().equals("n") ) //se o input for igual a 'n'
                    duelo_nao = true; //duelo_nao fica true
                
                if( duelo_sim )
                {
                    int j = verificaPratoUnico(edicoes.get(Integer.parseInt(dados1)), dados3); //verifica se este prato ja existe e retorna o caso
                    if( j == 1 || j == 2) //se existir no maximo 1 prato destes de duelo (e 0 sem ser) nesta edicao
                    {
                        if( verificaPratoDuelo(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)))) // se tiver prato do duelo apresenta mensagem de erro
                        {
                            display.replaceRange("Este concorrente ja tem o prato do duelo atribuido!", 479, 600);
                            sleep(2500);
                            display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                        }
                        else if(j == 2) //se este concorrente nao tiver prato do duelo atribui o prato
                        {
                            if( !edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getSexo().equals(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(retornaNumeroConcorrentePrato(edicoes.get(Integer.parseInt(dados1)), dados3)).getSexo()) ) //se os concorrentes sao de sexos opostos
                            {
                                if(verificaDados(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(pesquisaPrato(edicoes.get(Integer.parseInt(dados1)), dados3)).getPratos().get(dados3), dados4, dados5, Integer.parseInt(dados6))) //se os dados das duas instancias deste prato (o que ja estava atribuido e este novo) forem diferentes
                                {
                                    display.replaceRange("Os dados deste prato sao diferentes dos dados do outro prato deste duelo", 479, 600); //apresenta mensagem que informa do mesmo
                                    sleep(2500);
                                    conta++; //incrementa a contagem
                                    display.replaceRange("Pretende ficar com estes dados (SIM - o outro e atualizado ; NAO - este e atualizado) (s/n): ", 479, 600);
                                }
                                else //se sao iguais entao aceita este prato
                                {
                                    display.insert("Sim", 545);
                                    sleep(1000);
                                    Prato p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), duelo_sim); //cria este prato
                                    edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(p); //atribui-o ao concorrente
                                    display.replaceRange("                        ", 451, 477);
                                    display.replaceRange("Prato inserido com sucesso!", 477, 600);
                                    sleep(2000);
                                    conta = 1; //coloca a variavel de contagem novamente a 1
                                    apresentaMenuPrincipal(0); //apresenta o menu principal
                                    return;
                                }
                            }
                            else //se sao do mesmo sexo
                            {
                                display.replaceRange("Os concorrentes em duelo não podem ser do mesmo sexo!", 479, 600); //apresenta mensagem de erro
                                sleep(2500);
                                display.replaceRange("Clique em voltar para voltar atras!", 479, 600);
                                conta = 1; //coloca a variavel de contagem novamente a 1
                                menu = 17; //coloca a variavel menu a 17
                                return;
                            }
                        }
                        else //se este concorrente nao tiver prato do duelo atribui o prato
                        {
                            //se todos do sexo oposto ja tiverem pratos duelo
                            if(verificaPratosDueloSexoOposto(edicoes.get(Integer.parseInt(dados1)), edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getSexo()))
                            {
                                display.replaceRange("Todos os concorrentes do sexo oposto já têm um prato de duelo diferente deste.\nO prato não foi criado.", 479, 600);
                                sleep(3500); //espera 3.5s
                                display.replaceRange("Clique em voltar para voltar atras!", 479, 600);
                                conta = 1; //coloca a variavel de contagem novamente a 1
                                menu = 17; //coloca a variavel que indica o menu atual a 17
                                return;
                            }
                            else{
                                display.insert("Sim", 545);
                                sleep(1000); //espera 1s
                                Prato p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), duelo_sim); //cria um novo prato
                                edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(p); //adiciona-o
                                display.replaceRange("                        ", 451, 477);
                                display.replaceRange("Prato inserido com sucesso!", 477, 600);
                                sleep(2000);
                                conta = 1; //coloca a variavel de contagem novamente a 1
                                apresentaMenuPrincipal(0); //apresenta o menu principal
                                return;
                            }
                        }
                    }
                }
                else if( duelo_nao ) //se nao for para ser prato do duelo entao so pode ser atribuido a este concorrente se for unico
                {
                    if(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).getPratos().size() == 3 && !verificaPratoDuelo(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)))) //se este concorrente nao tiver prato do duelo e ja tiver 3 pratos
                    {
                        display.replaceRange("Este concorrente ainda nao tem prato do duelo e ja tem 3 pratos!", 479, 600); //apresenta mensagem de erro
                        sleep(2500);
                        display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                    }
                    else if( verificaPratoUnico(edicoes.get(Integer.parseInt(dados1)), dados3) == 1) //se for unico entao o prato e inserido com sucesso
                    {
                        display.insert("Nao", 545);
                        sleep(1000); //espera 1s
                        Prato p = new Prato(dados3, dados4, dados5, Double.parseDouble(dados6), Double.parseDouble(dados7), duelo_sim); //cria um novo prato
                        edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(p); //adiciona-o
                        display.replaceRange("                        ", 451, 477);
                        display.replaceRange("Prato inserido com sucesso!", 477, 600);
                        sleep(2000);
                        conta = 1; //coloca a variavel de contagem novamente a 1
                        apresentaMenuPrincipal(0); //apresenta o menu principal
                        return;
                    }
                    else if( verificaPratoUnico(edicoes.get(Integer.parseInt(dados1)), dados3) == 2) //se houver 1 do duelo com este nome nesta edicao
                    {
                        if(!verificaPratoDuelo(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)))) //e nao for deste concorrente
                        {
                            display.replaceRange("Este prato ja existe como prato do duelo nesta edicao! Se quiser pode ficar com o mesmo desde que seja tambem do duelo!", 479, 600); //apresenta as opcoes disponiveis
                            sleep(2500);
                            display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                        }
                    }
                }
                else if( !(duelo_sim || duelo_nao) ) //se a opcao for invalida (input diferente de 's' ou 'n')
                {
                    display.replaceRange("Opcao invalida!", 479, 600); //apresenta mensagem de erro
                    sleep(2500);
                    display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                }
            }
            if(conta == 7) // tempo usado
            {
                dados7 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados7.matches("[0-9]+") && !dados7.matches("[a-zA-Z]+")) //se o input nao tiver letras e tiver numeros
                {
                    display.insert(dados7, 545);
                    sleep(1000);
                    conta++; //incrementa a variavel de contagem aceitando o dado
                    display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                }
                else //se tiver letras ou nao tiver numeros apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Tempo usado: ", 479, 600);
                }
            }
            if(conta == 6) // tempo de execucao
            {
                dados6 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados6.matches("[0-9]+") && !dados6.matches("[a-zA-Z]+")) //se o input nao tiver letras e tiver numeros
                {
                    display.insert(dados6, 545);
                    sleep(1000);
                    conta++; //incrementa a variavel de contagem aceitando o dado
                    display.replaceRange("Tempo usado: ", 479, 600);
                }
                else //se tiver letras ou nao tiver numeros apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Tempo de execucao: ", 479, 600);
                }
            }
            if(conta == 5) // regiao
            {
                dados5 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(!dados5.matches("[0-9]+")) //se o input nao tiver numeros
                {
                    display.insert(dados5, 545);
                    sleep(1000);
                    conta++; //incrementa a variavel de contagem aceitando o dado
                    display.replaceRange("Tempo de execucao: ", 479, 600);
                }
                else //se tiver numeros apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Regiao: ", 479, 600);
                }
            }
            if(conta == 4) // tipo
            {
                dados4 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(!dados4.matches("[0-9]+")) //se o input nao tiver numeros
                {
                    display.insert(dados4, 545);
                    sleep(1000);
                    conta++; //incrementa a variavel de contagem aceitando o dado
                    display.replaceRange("Regiao: ", 479, 600);
                }
                else //se tiver numeros apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Tipo: ", 479, 600);
                }
            }
            if(conta == 3) // nome do prato
            {
                dados3 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(!dados3.matches("[0-9]+")) //verifica se nao tem numeros no input
                {
                    switch (verificaPratoUnico(edicoes.get(Integer.parseInt(dados1)), dados3)) { //verifica se este prato ja existe e retorna o caso (-1 se existir um prato que nao seja de duelo - nao pode ser atribuido mais nenhum)
                        case -1:                                                                                                                     //(0 se ja existirem 2 destes pratos de duelo - nao pode ser atribuido mais nenhum)
                            display.replaceRange("Este prato ja existe (e nao e do duelo)!", 479, 600);                                              //(1 se nao tiver nenhum prato destes - pode ser atribuido quer seja de duelo ou nao)
                            sleep(2500);                                                                                                             //(2 se tiver 1 prato destes de duelo - pode ser atribuido)
                            display.replaceRange("Nome do prato: ", 479, 600);
                            break;
                        case 0:
                            display.replaceRange("Ja existem dois destes pratos (do duelo) nesta edicao!", 479, 600);
                            sleep(2500);
                            display.replaceRange("Nome do prato: ", 479, 600);
                            break;
                        case 2:
                            if(verificaPratoDuelo(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2))))
                            {
                                display.replaceRange("Este prato ja existe como prato do duelo nesta edicao e este concorrente tambem ja tem prato do duelo!", 479, 600);
                                sleep(2500);
                                display.replaceRange("Nome do prato: ", 479, 600);
                            }   
                            else
                            {
                                display.insert(dados3, 545);
                                sleep(1000);
                                conta++;
                                display.replaceRange("Tipo: ", 479, 600);
                            }
                            break;
                        default:
                            display.insert(dados3, 545);
                            sleep(1000);
                            conta++;
                            display.replaceRange("Tipo: ", 479, 600);
                            break;
                    }
                }
                else //se tiver numeros apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Nome do prato: ", 479, 600);
                }
            }
            if(conta == 2) // numero
            {
                dados2 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados2.matches("[0-9]+") && !dados2.matches("[a-zA-Z]+"))
                {
                    if(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().keySet().contains(Integer.parseInt(dados2))) //se existe um concorrente com este numero nesta edicao
                    {
                        if(verificaPratos(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)))) //se o concorrente ja tiver 4 pratos
                        {
                            display.replaceRange("Este concorrente ja tem todos os pratos inseridos!", 479, 600); //apresenta mensagem de erro e espera por um input valido
                            sleep(2500);
                            display.replaceRange("Numero: ", 479, 600);
                        }
                        else //se tem menos de 4 pratos entao por enquanto pode ser atribuido e continua a pedir informacao, incrementando conta
                        {
                            display.insert(dados2, 545);
                            sleep(1000);
                            conta++; //incrementa a variavel de contagem aceitando o dado
                            display.replaceRange("Nome do prato: ", 479, 600);
                        }
                    }
                    else //se nao existe entao apresenta mensagem de erro e espera por um input valido
                    {
                        display.replaceRange("Nao existe um concorrente com o numero especificado!", 479, 600);
                        sleep(2500);
                        display.replaceRange("Numero: ", 479, 600);
                    }
                }
                else //se nao tiver numeros ou tiver letras apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Numero: ", 479, 600);
                }
            }
            if(conta == 1) // Edicao
            {
                dados1 = novosdados.getText(); //guarda os dados introduzidos
                novosdados.setText("");
                if(dados1.matches("[0-9]+") && !dados1.matches("[a-zA-Z]+")) //verifica que o input e um numero e nao contem letras
                {
                    if(edicoes.containsKey(Integer.parseInt(dados1))) //verifica se existe uma edicao do ano especificado
                    {
                        display.insert(dados1, 494);
                        sleep(1000);
                        conta++; //incrementa a variavel de contagem aceitando o dado
                        display.replaceRange("Numero: ", 479, 600);
                    }
                    else //se nao existir entao apresenta mensagem de erro e espera por um input valido
                    {
                        display.replaceRange("Nao existe uma edicao com o ano especificado!", 479, 550);
                        sleep(2500);
                        display.replaceRange("Ano da edicao: ", 479, 600);
                    }
                }
                else //se nao tiver numeros ou tiver letras apresenta mensagem de erro
                {
                    display.replaceRange("Dados Invalidos!", 479, 600);
                    sleep(2500);
                    display.replaceRange("Ano da edicao: ", 479, 600);
                }
            }
    }//GEN-LAST:event_bOKActionPerformed
    }
    
    //metodo chamado com o pressionar do botao 4
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        
        if(menu == 1) //se estiver no menu 1 e o botao 4 for clicado
            apresentaMenuPenalizacoes(13);
        else if(menu == 2) //se estiver no menu 2 e o botao 4 for clicado
            apresentaMenuInsiraNotas(16);
    }//GEN-LAST:event_b4ActionPerformed

    //metodo chamado com o pressionar do botao 5
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        
        if(menu == 1) //se estiver no menu 1 e o botao 5 for clicado
            apresentaVencedores(); //apresenta o menu de vencedores
    }//GEN-LAST:event_b5ActionPerformed

    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Main                                                                                                                                           ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try { //tenta
                    new MasterCook().setVisible(true);
                    lerEdicoes(); //le a informacao do ficheiro que guarda as edicoes
                    lerConcorrentes(); //le a informacao do ficheiro que guarda os concorrentes
                    lerPratos(); //le a informacao do ficheiro que guarda os pratos
                } catch (IOException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Declaracao de variaveis da interface                                                                                                           ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton bOK;
    private javax.swing.JButton bexecutar;
    private javax.swing.JButton bsair;
    private javax.swing.JButton bvoltar;
    public static java.awt.TextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.TextField novosdados;
    // End of variables declaration//GEN-END:variables
}
