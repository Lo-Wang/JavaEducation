package timus

import java.util.*;
import java.io.*;

// Подготавливаем основу для работы с векторами
public class 1909 {
    static class Vec {
        double x, y, z;

        Vec(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        Vec subtract(Vec v) {
            return new Vec(x - v.x, y - v.y, z - v.z);
        }

        Vec add(Vec v) {
            return new Vec(x + v.x, y + v.y, z + v.z);
        }

        double dot(Vec v) {
            return x * v.x + y * v.y + z * v.z;
        }

        Vec multiply(double f) {
            return new Vec(x * f, y * f, z * f);
        }

        Vec divide(double f) {
            return new Vec(x / f, y / f, z / f);
        }

        Vec cross(Vec v) {
            return new Vec(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
        }

        double norm() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        double norm2() {
            return x * x + y * y + z * z;
        }

        Vec normalize() {
            double d = norm();
            return new Vec(x / d, y / d, z / d);
        }
    }

    static double eps = 1e-9;

    static double dv(double x, double r) {
        return x / Math.sqrt(r * r - x * x);
    }

    static double find(double r, double k) {
        double L = -r, R = r;
        while (R - L > 1e-9) {
            double m = L + (R - L) / 2;
            if (dv(m, r) < k)
                L = m;
            else
                R = m;
        }
        return R;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Vec c, p1, p2, v;
        double R;

		// Чтение координат планеты и радиуса
        st = new StringTokenizer(br.readLine());
        c = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
        R = Double.parseDouble(st.nextToken());

		// Чтение координат первого зонда
        st = new StringTokenizer(br.readLine());
        p1 = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));

		// Чтение координат второго зонда
        st = new StringTokenizer(br.readLine());
        p2 = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));

		// Чтение вектора скорости
        st = new StringTokenizer(br.readLine());
        v = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
        v = v.normalize(); // Нормализуем вектор скорости

		// Инициализируем дополнительные переменные и проверяем
		// Парралельность векторов
        Vec w = p2.subtract(p1);
        Vec a = new Vec(0, 0, 0), b = new Vec(0, 0, 0);
        double cx, cy, cz;
        boolean along = false;

        if (Math.abs(v.cross(w.normalize()).norm()) < 1e-5) {
            w = new Vec(1000001, 1000002, 1000003);
            along = true;
        }

        a = w.cross(v).normalize();
        b = v.cross(a).normalize();

        double x = w.dot(b), y = v.dot(w);
        // Вычисление проекций и проверки
        cy = c.subtract(p1).dot(a);
        cx = c.subtract(p1).dot(b);
        cz = c.subtract(p1).dot(v);

        double d = w.cross(v).cross(w).dot(c.subtract(p1));
        double D = R * R - cy * cy;

        if (D < -eps) {
            System.out.println("False alarm");
            return;
        }

        if (along) {
            eps = 1e-5;
            if (d > 0 && cx * cx + cy * cy <= R * R + eps || (cx - x) * (cx - x) + cy * cy <= R * R + eps) {
                System.out.println("Crash");
                return;
            }
        }

        if (!along) {
            D = Math.max(D, 0);
            double x1 = cx - Math.sqrt(D);
            double x2 = cx + Math.sqrt(D);

            double p = find(Math.sqrt(D), y / x);
            Vec intersectionPoint = p1.add(w.normalize().multiply(p + cx).divide(w.dot(b) / w.norm()));

            if (p + cx > eps && p + cx < x - eps && c.subtract(intersectionPoint).dot(v) > -eps) {
                System.out.println("Warning");
                return;
            }

            if (v.dot(c.subtract(p1)) > -eps && x1 < eps && x2 > -eps || v.dot(c.subtract(p2)) > -eps && x1 < x + eps && x2 > x - eps) {
                System.out.println("Crash");
                return;
            }
        }

        System.out.println("False alarm");
    }
}
