package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton add, view, remove, save, load;
	ArrayList<String> tasks;

	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save
	 * list, and load list.
	 * 
	 * When add task is clicked: ask the user for a task and save it to an array
	 * list
	 * 
	 * When the view tasks button is clicked: show all the tasks in the list
	 * 
	 * When the remove task button is clicked: prompt the user for which task to
	 * remove and take it off of the list.
	 * 
	 * When the save list button is clicked: Save the list to a file
	 * 
	 * When the load list button is clicked: Prompt the user for the location of the
	 * file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file
	 * into the list.
	 */
	public void init() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton add = new JButton(), view = new JButton(), remove = new JButton(), save = new JButton(),
				load = new JButton();
		panel.add(add);
		panel.add(view);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		frame.add(panel);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setVisible(true);

		add.setText("ADD TASK");
		view.setText("VIEW TASKS");
		remove.setText("REMOVE TASK");
		save.setText("SAVE TEXTS");
		load.setText("LOAD TEXTS");
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("What task would you like to add?");
				tasks.add(s);
			}
		});
		view.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String task = "";
				for (int i = 0; i < tasks.size(); i++) {
					task = task.concat("Task #" + (i + 1) + ": " + tasks.get(i) + "\n");
				}
				JOptionPane.showMessageDialog(null, task);
			}
		});
		remove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("What task would you like to remove?");
				if (tasks.contains(s)) {
					tasks.remove(s);
				} else {
					JOptionPane.showMessageDialog(null, "There is no such task.");
				}
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String task = "";
				for (int i = 0; i < tasks.size(); i++) {
					task = task.concat(tasks.get(i) + "\n");
				}
				FileWriter f;
				try {
					f = new FileWriter("src/_02_File_Encrypt_Decrypt/print.txt");
					f.write(task);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("What task would you like to add?");
				tasks.add(s);
			}
		});
		tasks = new ArrayList<String>();
	}

	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {

		}
		if (e.getSource() == view) {

		}
	}
}
