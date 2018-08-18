var exponent = document.getElementById("modulus").value;
var modulus = document.getElementById("exponent").value;
var passwd = document.getElementById("password").value;

var rsaKey = new RSAKey()
rsaKey.setPublic(b64tohex(modulus), b64tohex(exponent))
var enPassword = hex2b64(rsaKey.encrypt(passwd))

document.getElementById("enpassword").value = enPassword
console.log(enPassword)