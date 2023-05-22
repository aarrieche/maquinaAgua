public class MaquinaAgua {
    
        private int quantidadeAgua;
        private int copos200;
        private int copos300;

        public MaquinaAgua() {
            this.quantidadeAgua = 0;
            this.copos200 = 0;
            this.copos300 = 0;
        }

        public int agua() {
            return quantidadeAgua;
        }

        public int copos200() {
            return copos200;
        }

        public int copos300() {
            return copos300;
        }

        public void servirCopo200() {
            if (copos200 > 0 && quantidadeAgua >=200) {
                quantidadeAgua -= 200;
                copos200--;
            }
        }

        public void servirCopo300() {
            if (copos300 > 0 && quantidadeAgua >= 300) {
                quantidadeAgua -= 300;
                copos300--;
            }
        }

        public void abastecerAgua() {
            quantidadeAgua = 20000;
        }

        public void abastecerCopo200() {
            copos200 = 100;

        }

        public void abastecerCopo300() {
            copos300 = 100;
            
        }
    }

