import tkinter
import tkinter.messagebox


class ProgramGUI:
    def __init__(self):
        self.main = tkinter.Tk()
        self.main.title('Toasted Sandwich')

        #  radiobuttons and checkbuttons
        self.breadFrame = tkinter.Frame(self.main)
        self.fillingFrame = tkinter.Frame(self.main)

        #  bread radiobutton value
        self.bread = tkinter.StringVar()
        self.bread.set('White')

        # create the label and radiobuttons for the bread choice
        tkinter.Label(self.main, text='Bread:').pack()
        tkinter.Radiobutton(self.breadFrame, text='White', variable=self.bread, value='White').pack(side='left')
        tkinter.Radiobutton(self.breadFrame, text='Wholemeal', variable=self.bread, value='Wholemeal').pack(side='left')
        tkinter.Radiobutton(self.breadFrame, text='Multigrain', variable=self.bread, value='Multigrain').pack(
            side='left')

        self.breadFrame.pack(padx=4, pady=(0, 10))

        # checkbuttons
        self.ham = tkinter.StringVar()
        self.cheese = tkinter.StringVar()
        self.tomato = tkinter.StringVar()

        # label and checkbuttons for the filling options
        tkinter.Label(self.main, text='Fillings:').pack()
        tkinter.Checkbutton(self.fillingFrame, text='Ham', variable=self.ham, offvalue='', onvalue='  Ham\n').pack(
            side='left')
        tkinter.Checkbutton(self.fillingFrame, text='Cheese', variable=self.cheese, offvalue='',
                            onvalue='  Cheese\n').pack(side='left')
        tkinter.Checkbutton(self.fillingFrame, text='Tomato', variable=self.tomato, offvalue='',
                            onvalue='  Tomato\n').pack(side='left')
        self.fillingFrame.pack(padx=4, pady=(0, 10))

        #  submit button
        tkinter.Button(self.main, text='Submit Order', command=self.submit).pack(pady=(0, 6))

        tkinter.mainloop()

    def submit(self):  # error message
        if len(self.ham.get() + self.cheese.get() + self.tomato.get()) == 0:
            tkinter.messagebox.showerror('No Filling', 'Select at least one filling.')
        else:
            self.order = 'Order submitted.\n\n' + self.bread.get() + ' bread.\n\nFillings:\n'
            self.order += self.ham.get() + self.cheese.get() + self.tomato.get()
            tkinter.messagebox.showinfo('Order Submitted', self.order)


gui = ProgramGUI()  #  object creat
