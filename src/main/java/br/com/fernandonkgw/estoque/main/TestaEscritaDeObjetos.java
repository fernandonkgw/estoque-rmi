package br.com.fernandonkgw.estoque.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.fernandonkgw.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itens.bin"))){
			
			ItemEstoque item1 = new ItemEstoque("ARQ", 2);
			ItemEstoque item2 = new ItemEstoque("SOA", 3);
			
			List<ItemEstoque> itens = new ArrayList<ItemEstoque>();
			itens.add(item1);
			itens.add(item2);
			
			oos.writeObject(itens);
		}
	}

}
