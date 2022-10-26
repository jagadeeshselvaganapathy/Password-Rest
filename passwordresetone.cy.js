/// <reference types = "cypress"/>

context('password reset',()=>{

    const serverId = 'zl74egxy';
    const serverDomain = 'zl74egxy.mailosaur.net';
    const emailAddress = 'passwordresettest@'+ serverDomain;
let passwordResetLink
    it('should be possible to request a reset',()=>{
        

       cy.visit('https://login.bigcommerce.com/recover/new')
       cy.get('#user_email').type('passwordresettest@zl74egxy.mailosaur.net')
       cy.get('.login-form-button').click()
     //  cy.get('form').submit()
      /* cy.get('#email').type(emailAddress)
       cy.get('form').submit()*/


   
   cy.mailosaurGetMessage(serverId, {
    sentTo: 'passwordresettest@zl74egxy.mailosaur.net'
  }).then((message) => {
    cy.log('Message subject:', message.subject);
    
  
        passwordResetLink = message.html.links[0].href  
        
    })
})
it('should allow the setting of the new password',()=>{
cy.visit(passwordResetLink)
/*cy.get('#password').type('abc123')
cy.get('form').submit()*/
})
})
