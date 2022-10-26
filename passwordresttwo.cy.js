/// <reference types = "cypress"/>

context('password reset',()=>{

    const serverId = 'zl74egxy';
    const serverDomain = 'zl74egxy.mailosaur.net';
    const emailAddress = 'passwordresettest@'+ serverDomain;
let passwordResetLink
    it('should be possible to request a reset',()=>{
        

       cy.visit('https://www.roomsforafrica.com/travellers/forgotpasswordform.do')
       cy.get('#email').type('passwordresettest@zl74egxy.mailosaur.net')
       cy.get('.btn').click()
     //  cy.get('form').submit()
     /*  cy.get('#email').type(emailAddress)
       cy.get('form').submit()*/


   
   cy.mailosaurGetMessage(serverId, {
    sentTo: 'passwordresettest@zl74egxy.mailosaur.net'
  }).then((message) => {
    cy.log('Message subject:', message.subject);
    
  
        passwordResetLink = message.html.links[0].href  
        
    })
})
it('should allow the setting of the new password',()=>{
  cy.wait(10000)
cy.visit(passwordResetLink + '/travellers/resetpasswordform.do?emailAddress=passwordresettest@zl74egxy.mailosaur.net&code=604292')
cy.get('ul > :nth-child(2) > input').type('Abcd@123')
cy.get(':nth-child(3) > input').type('Abcd@123')
cy.get('.btn').click()
//cy.get('#password').type('abc123')
//cy.get('form').submit()*/
})
})