class TicTacToe:
    def __init__(self):
        self.board = [' '] * 9  # игровое поле 3x3
        self.current_player = 'X'  # текущий игрок

    def print_board(self):
        print('---------')
        for i in range(0, 9, 3):
            print('|', self.board[i], '|', self.board[i + 1], '|', self.board[i + 2], '|')
            print('---------')

    def make_move(self, position):
        if self.board[position] == ' ':
            self.board[position] = self.current_player
            self.current_player = 'O' if self.current_player == 'X' else 'X'
        else:
            print('Уже занято. Попробуй еще.')

    def check_winner(self):
        winning_combinations = [
            [0, 1, 2], [3, 4, 5], [6, 7, 8],  # горизонтальные
            [0, 3, 6], [1, 4, 7], [2, 5, 8],  # вертикальные
            [0, 4, 8], [2, 4, 6]              # диагональные
        ]
        for combination in winning_combinations:
            if self.board[combination[0]] == self.board[combination[1]] == self.board[combination[2]] != ' ':
                return self.board[combination[0]]
        if ' ' not in self.board:
            return 'Draw'
        return None

    def play(self):
        while True:
            self.print_board()
            position = int(input(f"{self.current_player}, сделай свой ход: "))
            self.make_move(position)
            winner = self.check_winner()
            if winner:
                self.print_board()
                if winner == 'Draw':
                    print("Ничья :(")
                else:
                    print(f"Победил {winner} игрок!")
                break

