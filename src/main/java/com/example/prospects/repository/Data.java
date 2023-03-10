package com.example.prospects.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.prospects.model.Client;

@Component
public class Data {
	private ArrayList<Client> clientsList = new ArrayList<Client>(generateData());

	public ArrayList<Client> generateData() {
		ArrayList<Client> clients = new ArrayList<Client>();
		clients.add(new Client(1,"Bob", "12356", "123 rue Bidon", "99999", "Fakeville"));
		clients.add(new Client(2,"Albert", "12356", "123 rue Bidon", "99999", "Fakeville"));
		clients.add(new Client(3,"Micheline", "12356", "123 rue Bidon", "99999", "Fakeville"));
		return clients;
	}
	
	public ArrayList<Client> getData() {
		return this.clientsList;
	}
	
	public boolean addData(Client client) {
		client.setId(this.clientsList.get(this.clientsList.size() - 1).getId() + 1);
		return this.clientsList.add(client);
	}
	
	public boolean removeData(int id) {
		return this.clientsList.removeIf(client -> client.getId() == id);
	}
}
