for(let i=0; i<5; i++) {
  let d = new Date();
  console.log(
    String(d.getDate()).padStart(2, '0') + '-' +
    String(d.getMonth()+1).padStart(2, '0') + '-' +
    d.getFullYear()
  );
}
