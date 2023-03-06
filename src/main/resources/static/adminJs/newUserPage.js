const form_new = document.getElementById('formForNewUser');
const role_new = document.querySelector('#roles').selectedOptions;



async function newUser() {
    form_new.addEventListener('submit', addNewUser);


    async function addNewUser(event) {
        event.preventDefault();
        const urlNew = 'api/admin/newAddUser';
        let listOfRole = [];
        for (let i = 0; i < role_new.length; i++) {
            listOfRole.push("ROLE_" + role_new[i].value);
        }
        let method = {
            method: 'POST',
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                name: form_new.name.value,
                lastName: form_new.lastName.value,
                age: form_new.age.value,
                email: form_new.email.value,
                password: form_new.password.value,
                roles: listOfRole
            })
        }
        await fetch(urlNew,method).then(() => {
            form_new.reset();
            getAdminPage();
        });
    }
}