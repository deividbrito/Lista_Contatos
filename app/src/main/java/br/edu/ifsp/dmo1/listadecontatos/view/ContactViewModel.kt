package br.edu.ifsp.dmo1.listadecontatos.view

import androidx.lifecycle.ViewModel
import br.edu.ifsp.dmo1.listadecontatos.model.Contact

class ContactViewModel : ViewModel() {
    val contactList = mutableListOf<Contact>()
}
