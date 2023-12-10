package com.example.demo.controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CaptchaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response, String a)
			throws ServletException, IOException,InvocationTargetException {

		int width = 180;
		int height = 50;

		char[] chararray = a.toCharArray();

		char data[][] = { chararray };

		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics2D g2d = bufferedImage.createGraphics();

		Font font = new Font("Georgia", Font.BOLD, 18);
		g2d.setFont(font);

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		g2d.setRenderingHints(rh);

		GradientPaint gp = new GradientPaint(0, 0, Color.gray, 0, height / 2, Color.WHITE, true);

		g2d.setPaint(gp);
		g2d.fillRect(0, 0, width, height);


		g2d.setColor(new Color(0,0,0));

		Random r = new Random();
		int index = 0;
		int x = 0;
		int y = 0;

		for (int i = 0; i < data[index].length; i++) {
			x += 10 + (Math.abs(r.nextInt()) % 15);
			y = 20 + Math.abs(r.nextInt()) % 20;
			g2d.drawChars(data[index], i, 1, x, y);
		}

		response.setContentType("image/png");
		OutputStream os = response.getOutputStream();
		ImageIO.write(bufferedImage, "png", os);
		g2d.dispose();
		os.close();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		
		try {
			char[] CHARSET_AZ_09 = "0123456789".toCharArray();
			String captch = randomString(CHARSET_AZ_09, 4);
			session.setAttribute("captcha", captch.trim());
			processRequest(request, response, captch);
		} catch (InvocationTargetException e) {
			
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response, String a)
			throws ServletException, IOException, InvocationTargetException {
		processRequest(request, response, a);
	}

	public static String randomString(char[] characterSet, int length) {
		
		Random random = new SecureRandom();
		char[] result = new char[length];
		for (int i = 0; i < result.length; i++) {
			// picks a random index out of character set > random character
			int randomCharIndex = random.nextInt(characterSet.length);
			result[i] = characterSet[randomCharIndex];
		}
		return new String(result);

	}
}
