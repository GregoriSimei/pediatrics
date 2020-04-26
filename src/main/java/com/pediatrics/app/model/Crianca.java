package com.pediatrics.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "criancas")
public class Crianca extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
}
