const main = () => {
  const button = document.querySelector('button');
  const body = document.querySelector('body');

  document.onkeyup = (e) => {
      e.preventDefault();
      e.key ? alert(e.key) : alert("NOTHING")
  }
}

main()