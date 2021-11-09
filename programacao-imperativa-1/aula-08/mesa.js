function climbAboard(height, isAccompanied) {
  console.log(
    height > 1.4
      ? "Acesso autorizado"
      : height > 1.2
      ? "Acesso autorizado somente com acompanhante"
      : "Acesso negado"
  );
  switch (true) {
    case height > 1.4 && height < 2:
      return true;
    case height < 1.4 && isAccompanied:
      return true;
    case height < 1.2:
      return false;
  }
}

console.log(climbAboard(1.5, true));
console.log(climbAboard(1.3, true));
console.log(climbAboard(1.1, false));
