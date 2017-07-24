package com.hb.cm;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


public class BookJFrame extends JFrame {
	public BookJFrame() {
		BookTableModel btm = new BookTableModel();
		BookDAO bd = new BookDAO();
		
		
		setTitle("Book 테이블");
		
		JTable table = new JTable(btm);
		
		JScrollPane jsp = new JScrollPane(table);
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200,ds.height/2-200,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		table.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode()==e.VK_ENTER){
					int row = table.getSelectedRow();
					BookVO bv = btm.getRow(row);
					int res = bd.getUpdate(
							bv.getBookid(),
							bv.getBookname(),
							bv.getPublisher(),
							bv.getPrice()
					);
					if (res>0) {
						JOptionPane.showMessageDialog(getParent(), "수정 성공", "수정", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
//		btm.addTableModelListener(new TableModelListener() {
//			
//			@Override
//			public void tableChanged(TableModelEvent e) {
//				if(e.getType()==e.UPDATE){
//					BookVO bv = btm.getRow(e.getLastRow());
//					System.out.println(bv.getBookid());
//					int res = bd.getUpdate(
//							bv.getBookid(),
//							bv.getBookname(),
//							bv.getPublisher(),
//							bv.getPrice()
//					);
//					System.out.println(bv.getBookname());
//					if (res>0) {
//						JOptionPane.showMessageDialog(getParent(), "수정 성공", "수정", JOptionPane.INFORMATION_MESSAGE);
//					}
//				}
//			}
//		});
	}
}
