PGDMP     7                    z            dbfollowclass    14.4    14.2 ;               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16777    dbfollowclass    DATABASE     h   CREATE DATABASE dbfollowclass WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Peru.1252';
    DROP DATABASE dbfollowclass;
                postgres    false            �            1259    16778    curso    TABLE       CREATE TABLE public.curso (
    id_curso integer NOT NULL,
    nombre character varying(45),
    docente character varying(45),
    facultad character varying(45),
    escuela character varying(45),
    plan character varying(45),
    periodo_academico character varying(45),
    cantidad_semanas integer DEFAULT 16,
    ciclo integer,
    tipo character varying(45),
    creditos integer,
    aprobado integer,
    hora_inicio time without time zone,
    hora_fin time without time zone,
    fecha_inicio date
);
    DROP TABLE public.curso;
       public         heap    postgres    false            	           0    0    TABLE curso    COMMENT     *   COMMENT ON TABLE public.curso IS 'TRIAL';
          public          postgres    false    209            
           0    0    COLUMN curso.id_curso    COMMENT     4   COMMENT ON COLUMN public.curso.id_curso IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.nombre    COMMENT     2   COMMENT ON COLUMN public.curso.nombre IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.docente    COMMENT     3   COMMENT ON COLUMN public.curso.docente IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.facultad    COMMENT     4   COMMENT ON COLUMN public.curso.facultad IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.escuela    COMMENT     3   COMMENT ON COLUMN public.curso.escuela IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.plan    COMMENT     0   COMMENT ON COLUMN public.curso.plan IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.periodo_academico    COMMENT     =   COMMENT ON COLUMN public.curso.periodo_academico IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.cantidad_semanas    COMMENT     <   COMMENT ON COLUMN public.curso.cantidad_semanas IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.ciclo    COMMENT     1   COMMENT ON COLUMN public.curso.ciclo IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.tipo    COMMENT     0   COMMENT ON COLUMN public.curso.tipo IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.creditos    COMMENT     4   COMMENT ON COLUMN public.curso.creditos IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.aprobado    COMMENT     4   COMMENT ON COLUMN public.curso.aprobado IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.hora_inicio    COMMENT     7   COMMENT ON COLUMN public.curso.hora_inicio IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.hora_fin    COMMENT     4   COMMENT ON COLUMN public.curso.hora_fin IS 'TRIAL';
          public          postgres    false    209                       0    0    COLUMN curso.fecha_inicio    COMMENT     8   COMMENT ON COLUMN public.curso.fecha_inicio IS 'TRIAL';
          public          postgres    false    209            �            1259    16785 
   estudiante    TABLE     C  CREATE TABLE public.estudiante (
    id_estudiante integer NOT NULL,
    nombre_apellido character varying(45),
    email character varying(45),
    "contraseña" character varying(45),
    facultad character varying(45),
    escuela character varying(45),
    plan character varying(45),
    ciclo character varying(4)
);
    DROP TABLE public.estudiante;
       public         heap    postgres    false                       0    0    TABLE estudiante    COMMENT     /   COMMENT ON TABLE public.estudiante IS 'TRIAL';
          public          postgres    false    211                       0    0    COLUMN estudiante.id_estudiante    COMMENT     >   COMMENT ON COLUMN public.estudiante.id_estudiante IS 'TRIAL';
          public          postgres    false    211                       0    0 !   COLUMN estudiante.nombre_apellido    COMMENT     @   COMMENT ON COLUMN public.estudiante.nombre_apellido IS 'TRIAL';
          public          postgres    false    211                       0    0    COLUMN estudiante.email    COMMENT     6   COMMENT ON COLUMN public.estudiante.email IS 'TRIAL';
          public          postgres    false    211                       0    0    COLUMN estudiante."contraseña"    COMMENT     >   COMMENT ON COLUMN public.estudiante."contraseña" IS 'TRIAL';
          public          postgres    false    211                       0    0    COLUMN estudiante.facultad    COMMENT     9   COMMENT ON COLUMN public.estudiante.facultad IS 'TRIAL';
          public          postgres    false    211                       0    0    COLUMN estudiante.escuela    COMMENT     8   COMMENT ON COLUMN public.estudiante.escuela IS 'TRIAL';
          public          postgres    false    211                        0    0    COLUMN estudiante.plan    COMMENT     5   COMMENT ON COLUMN public.estudiante.plan IS 'TRIAL';
          public          postgres    false    211            �            1259    16784    estudiante_id_estudiante_seq    SEQUENCE     �   CREATE SEQUENCE public.estudiante_id_estudiante_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.estudiante_id_estudiante_seq;
       public          postgres    false    211            !           0    0    estudiante_id_estudiante_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.estudiante_id_estudiante_seq OWNED BY public.estudiante.id_estudiante;
          public          postgres    false    210            �            1259    16792    tareas    TABLE     �  CREATE TABLE public.tareas (
    id_tarea integer NOT NULL,
    titulo character varying(45) NOT NULL,
    fecha date NOT NULL,
    hora_inicio time without time zone NOT NULL,
    hora_fin time without time zone NOT NULL,
    color_r integer DEFAULT 255 NOT NULL,
    color_g integer DEFAULT 255 NOT NULL,
    color_b integer DEFAULT 255 NOT NULL,
    descripcion character varying(200),
    id_estudiante integer NOT NULL,
    repeticiones integer
);
    DROP TABLE public.tareas;
       public         heap    postgres    false            "           0    0    TABLE tareas    COMMENT     +   COMMENT ON TABLE public.tareas IS 'TRIAL';
          public          postgres    false    213            #           0    0    COLUMN tareas.id_tarea    COMMENT     5   COMMENT ON COLUMN public.tareas.id_tarea IS 'TRIAL';
          public          postgres    false    213            $           0    0    COLUMN tareas.titulo    COMMENT     3   COMMENT ON COLUMN public.tareas.titulo IS 'TRIAL';
          public          postgres    false    213            %           0    0    COLUMN tareas.fecha    COMMENT     2   COMMENT ON COLUMN public.tareas.fecha IS 'TRIAL';
          public          postgres    false    213            &           0    0    COLUMN tareas.hora_inicio    COMMENT     8   COMMENT ON COLUMN public.tareas.hora_inicio IS 'TRIAL';
          public          postgres    false    213            '           0    0    COLUMN tareas.hora_fin    COMMENT     5   COMMENT ON COLUMN public.tareas.hora_fin IS 'TRIAL';
          public          postgres    false    213            (           0    0    COLUMN tareas.color_r    COMMENT     4   COMMENT ON COLUMN public.tareas.color_r IS 'TRIAL';
          public          postgres    false    213            )           0    0    COLUMN tareas.color_g    COMMENT     4   COMMENT ON COLUMN public.tareas.color_g IS 'TRIAL';
          public          postgres    false    213            *           0    0    COLUMN tareas.color_b    COMMENT     4   COMMENT ON COLUMN public.tareas.color_b IS 'TRIAL';
          public          postgres    false    213            +           0    0    COLUMN tareas.descripcion    COMMENT     8   COMMENT ON COLUMN public.tareas.descripcion IS 'TRIAL';
          public          postgres    false    213            ,           0    0    COLUMN tareas.id_estudiante    COMMENT     :   COMMENT ON COLUMN public.tareas.id_estudiante IS 'TRIAL';
          public          postgres    false    213            -           0    0    COLUMN tareas.repeticiones    COMMENT     9   COMMENT ON COLUMN public.tareas.repeticiones IS 'TRIAL';
          public          postgres    false    213            �            1259    16791    tareas_id_tarea_seq    SEQUENCE     �   CREATE SEQUENCE public.tareas_id_tarea_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.tareas_id_tarea_seq;
       public          postgres    false    213            .           0    0    tareas_id_tarea_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.tareas_id_tarea_seq OWNED BY public.tareas.id_tarea;
          public          postgres    false    212            f           2604    16788    estudiante id_estudiante    DEFAULT     �   ALTER TABLE ONLY public.estudiante ALTER COLUMN id_estudiante SET DEFAULT nextval('public.estudiante_id_estudiante_seq'::regclass);
 G   ALTER TABLE public.estudiante ALTER COLUMN id_estudiante DROP DEFAULT;
       public          postgres    false    211    210    211            g           2604    16795    tareas id_tarea    DEFAULT     r   ALTER TABLE ONLY public.tareas ALTER COLUMN id_tarea SET DEFAULT nextval('public.tareas_id_tarea_seq'::regclass);
 >   ALTER TABLE public.tareas ALTER COLUMN id_tarea DROP DEFAULT;
       public          postgres    false    213    212    213            �          0    16778    curso 
   TABLE DATA           �   COPY public.curso (id_curso, nombre, docente, facultad, escuela, plan, periodo_academico, cantidad_semanas, ciclo, tipo, creditos, aprobado, hora_inicio, hora_fin, fecha_inicio) FROM stdin;
    public          postgres    false    209   H9                  0    16785 
   estudiante 
   TABLE DATA           z   COPY public.estudiante (id_estudiante, nombre_apellido, email, "contraseña", facultad, escuela, plan, ciclo) FROM stdin;
    public          postgres    false    211   �B                 0    16792    tareas 
   TABLE DATA           �   COPY public.tareas (id_tarea, titulo, fecha, hora_inicio, hora_fin, color_r, color_g, color_b, descripcion, id_estudiante, repeticiones) FROM stdin;
    public          postgres    false    213   6C       /           0    0    estudiante_id_estudiante_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.estudiante_id_estudiante_seq', 19, true);
          public          postgres    false    210            0           0    0    tareas_id_tarea_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.tareas_id_tarea_seq', 28, true);
          public          postgres    false    212            l           2606    16783    curso pk_curso 
   CONSTRAINT     R   ALTER TABLE ONLY public.curso
    ADD CONSTRAINT pk_curso PRIMARY KEY (id_curso);
 8   ALTER TABLE ONLY public.curso DROP CONSTRAINT pk_curso;
       public            postgres    false    209            n           2606    16790    estudiante pk_estudiante 
   CONSTRAINT     a   ALTER TABLE ONLY public.estudiante
    ADD CONSTRAINT pk_estudiante PRIMARY KEY (id_estudiante);
 B   ALTER TABLE ONLY public.estudiante DROP CONSTRAINT pk_estudiante;
       public            postgres    false    211            q           2606    16800    tareas pk_tareas 
   CONSTRAINT     T   ALTER TABLE ONLY public.tareas
    ADD CONSTRAINT pk_tareas PRIMARY KEY (id_tarea);
 :   ALTER TABLE ONLY public.tareas DROP CONSTRAINT pk_tareas;
       public            postgres    false    213            o           1259    16801    fk_tarea_estudiante_id_idx    INDEX     V   CREATE INDEX fk_tarea_estudiante_id_idx ON public.tareas USING btree (id_estudiante);
 .   DROP INDEX public.fk_tarea_estudiante_id_idx;
       public            postgres    false    213            r           2606    16802    tareas fk_tarea_estudiante_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.tareas
    ADD CONSTRAINT fk_tarea_estudiante_id FOREIGN KEY (id_estudiante) REFERENCES public.estudiante(id_estudiante) ON UPDATE CASCADE ON DELETE CASCADE;
 G   ALTER TABLE ONLY public.tareas DROP CONSTRAINT fk_tarea_estudiante_id;
       public          postgres    false    3182    211    213            �   j	  x��ZKr�H\NQPO�G��@�HÁ���ћ2Y�`���@�[�y�/&|�^��}\l���DQ�0�L�æd��L�˗�U�t~P|�\�2�M�l�������{.3�O2���L���ş�N�|!�<����L΋����X�i���5����'��-R'>i��=Rk��V����/��5��Z��02{ŷ0<�7���7o=[�4�r.����،��t�A���Xc�����)����~}��E�$���ucE e��Z��c�u�&���l�'�����'���).i��kq�瞈�4>�5��Q��F�e�Oj:��B3|���~?zo��\@�_�@t�?&}+�e~�풸f���*�_�2�u�o�=u��O�ʒOR����M�``z�sE�5{���a����FH)$���2�r�d�z;Z�����n;$`=�� ���,Ud!�|w�^����Q����s����2�oČ�g�<�G0*��C��������1� �Vr>��t�y,U���l)Z|���x��S��;^��ػ�ڑ��\NE:�3:��<��o�-ޘ��"K���
��5�I6t*�`t���h�k|�y���Y:��L*sFA:���6���Z���`dE����L�sȓ8�[�����8�W
�ş�1���d �z�Z[N�,I��D�7��,N8u����8�w��n�ܳc`mC�,��1���F��^�ܵ����|�:C��Ly:=���| �agG�.hGM�6�"Wъs��(�x'SU����h�[/��Qہ�,<��Gv]3t�;X�h%�`B3$N<�X��E����WKyw4�?��f$2�
!�t���m٥n�}l;d(2��(��O ��[Dв����u�Ũ�vl�����`�rH&��7�YF{�*��+~l4�9�|d�GA	l#�:;�7����HK��9��t��T����v���M��u�z���vbqD{��l*U��O�C�Q�nW
�F��,�{�\��X��`��'k�
�QR��!źf ���6�Z�J����Wp���d���\77�^k�ڠe�@P}J�hW3�	R��3{�������z���g]b&\N�>�����$��?d���u2f����OWtl:�}��*\TP�"� f�Yin�iD�>�h�Q�a�?��e�����u�5C�u
5�0�J	�fR�p��˃/ֶ�^�i�Vo��!D�m�pd�-�B�k+9�H���$���,3� ��8�ק������vWC]��5ǀ,K����x)]pUPC
���l��>�tN������V��rH���a�j_1FJ>�/��z[퇀�FLC�7�X5�ьߣ�a�S��"�Ԟ�|r�eEİ�1�.gnG�rcQ�����w�Z���
O��Զ���e��-�V��ר=u5�.%������˖\i���_2ʒ�B,�� ��J`3��NzvȊ���+��t��K!y�:G8­3t�Ah��=���a�0z>q��,�ԗ�*>܃�<?�Z�����ը�Yʾ��n�"�;Ef���� q�|������'��[��a�\P��a��N8�U��k�&1��Sv�H����gY��6؃��^({�F_�y�ҡ(��}�Ŀ�y̏��yf����/Ƀ۞'4l��/9m���\U��FBsH$���8L#)>�C�t����E�v*m��_��v�M��A�M>�[��Y��o�\�!�L��ف!6^�(�f��E�&{���W-N��q2��K���K�~I����5�a��W��ٳ_�z��[o�O�Ū�i���q-��
Xdu�����O�D�Z���y�QaKݶ�6��U*��B��yy��*P���v�*!�K��b���Z�m�3�m�7�+�F��9mh��C ��;R��y|燆�v��2t5��Sn�-����b1E��
�)[]�ȟ�r��nX��il�Z=��=Ӂ�#X ט'��P�䞈Q�G���Bwk�}-�tb!sY#�/;B&%Z��p����������oX����2�׋ld�`A���Ō 6�L��cނ�.�ھ+���ݨ�Vv��2(��#Pxr+��/�0�����3>�k5�^&Z�V^!U�P�{�ԓ�ﻭ+�B<�0�빽�؛��ŗӛ�^a׬k���ZI��a4��x�1fA��	�Y����3x�<���1\�\��0��u�uO�͖�)�ՆrG-�-��+�9��+]YN=d^������tP��<�
�!]{�ˬ�|e�R��1����+h}����5����T�0�eQy$hB�/Խ�n6ᩘa�|t��Ĉml�yv�^�r ׉�P}�t���<𑼑�����N۫�1����R�����SPwP          d   x�3��t-.)M�L�+I�L�/*J�Ry%E�ũ�7&rz楧�e�^������Y\���X�������_�{xaIf2�������ĢTN#CN3�=... H�&            x������ � �     