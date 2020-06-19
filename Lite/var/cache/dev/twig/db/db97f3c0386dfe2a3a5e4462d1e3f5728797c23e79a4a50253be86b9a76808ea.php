<?php

use Twig\Environment;
use Twig\Error\LoaderError;
use Twig\Error\RuntimeError;
use Twig\Markup;
use Twig\Sandbox\SecurityError;
use Twig\Sandbox\SecurityNotAllowedTagError;
use Twig\Sandbox\SecurityNotAllowedFilterError;
use Twig\Sandbox\SecurityNotAllowedFunctionError;
use Twig\Source;
use Twig\Template;

/* base.html.twig */
class __TwigTemplate_a81d5a8938d670b5d51b2f0613a56d119902e04f97a882d14b6f220cb0989fa6 extends \Twig\Template
{
    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->parent = false;

        $this->blocks = [
            'nour' => [$this, 'block_nour'],
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base.html.twig"));

        // line 1
        echo "
<!DOCTYPE html>
<html lang=\"en\">

<head>

    <meta charset=\"utf-8\">
    <title>STUDYNET - VOTRE ECOLE </title>
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
    <meta name=\"description\" content=\"\">
    <meta name=\"author\" content=\"\">

    <!-- CSS -->
    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,400\">
    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Droid+Sans\">
    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Lobster\">
    <link rel=\"stylesheet\" href=\"";
        // line 17
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/bootstrap/css/bootstrap.min.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" href=\"";
        // line 18
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/prettyPhoto/css/prettyPhoto.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" href=\"";
        // line 19
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/css/flexslider.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" href=\"";
        // line 20
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/css/font-awesome.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" href=\"";
        // line 21
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/css/style.css"), "html", null, true);
        echo "\">


    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>
    <![endif]-->
";
        // line 28
        $this->displayBlock('nour', $context, $blocks);
        // line 29
        echo "    <!-- Favicon and touch icons -->
    <link rel=\"shortcut icon\" href=\"";
        // line 30
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/ico/favicon.ico"), "html", null, true);
        echo "\">
    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"";
        // line 31
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/ico/apple-touch-icon-144-precomposed.png"), "html", null, true);
        echo "\">
    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"";
        // line 32
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/ico/apple-touch-icon-114-precomposed.png"), "html", null, true);
        echo "\">
    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"";
        // line 33
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/ico/apple-touch-icon-72-precomposed.png"), "html", null, true);
        echo "\">
    <link rel=\"apple-touch-icon-precomposed\" href=\"";
        // line 34
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/ico/apple-touch-icon-57-precomposed.png"), "html", null, true);
        echo "\">

    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,400i,600,700|Raleway:300,400,400i,500,500i,700,800,900\" rel=\"stylesheet\">

    <!-- Bootstrap CSS File -->
    <link href=\"";
        // line 39
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("lib/bootstrap/css/bootstrap.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">

    <!-- Libraries CSS Files -->
    <link href=\"";
        // line 42
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/nivo-slider/css/nivo-slider.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
    <link href=\"";
        // line 43
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/owlcarousel/owl.carousel.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
    <link href=\"";
        // line 44
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/owlcarousel/owl.transitions.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
    <link href=\"";
        // line 45
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/font-awesome/css/font-awesome.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
    <link href=\"";
        // line 46
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/animate/animate.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
    <link href=\"";
        // line 47
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/venobox/venobox.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">

    <!-- Nivo Slider Theme -->
    <link href=\"";
        // line 50
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/css/nivo-slider-theme.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">

    <!-- Main Stylesheet File -->
    <link href=\"";
        // line 53
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/css/style.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">

    <!-- Responsive Stylesheet File -->
    <link href=\"";
        // line 56
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/css/responsive.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
</head>

<body>

<!-- Header -->
<div class=\"container\">
    <div class=\"header row\">
        <div class=\"span12\">
            <div class=\"navbar\">
                <div class=\"navbar-inner\">
                    <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                    </a>
                    <h3>
                        <a class=\"brand\" href=\"index.html\">STUDYNET - a super cool SCHOOL ...</a>
                    </h3>
                    <div class=\"nav-collapse collapse\">
                        <ul class=\"nav pull-right\">
                            <li class=\"current-page\">
                                <a href=\"#\"><i class=\"icon-home\"></i><br />Home</a>
                            </li>
                            <li>
                                <a href=\"#\"><i class=\"icon-camera\"></i><br />Scolarité</a>
                            </li>
                            <li>
                                <a href=\"#\"><i class=\"icon-comments\"></i><br />Administration</a>
                            </li>
                            <li>
                                <a href=\"";
        // line 87
        echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("livre_indexFront");
        echo "\"><i class=\"icon-tasks\"></i><br />Bibliothéque</a>
                            </li>
                            <li>
                                <a href=\"";
        // line 90
        echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("front_list");
        echo "\"><i class=\"icon-user\"></i><br />Evénements</a>
                            </li>
                            <li>
                                <a href=\"#\"><i class=\"icon-user\"></i><br />Cours et Quizz</a>
                            </li>
                            <li>
                            ";
        // line 96
        if ($this->env->getExtension('Symfony\Bridge\Twig\Extension\SecurityExtension')->isGranted("IS_AUTHENTICATED_REMEMBERED")) {
            // line 97
            echo "                                ";
            if ($this->env->getExtension('Symfony\Bridge\Twig\Extension\SecurityExtension')->isGranted("ROLE_ADMIN")) {
                // line 98
                echo "                                    <a href=\"";
                echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("categorie_new");
                echo "\"><i class=\"icon-user\"></i><br />Espace Admin</a>
                                ";
            }
            // line 100
            echo "                                ";
            if ($this->env->getExtension('Symfony\Bridge\Twig\Extension\SecurityExtension')->isGranted("ROLE_ENSEIGNANT")) {
                // line 101
                echo "                                    <a href=\"";
                echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("categorie_new");
                echo "\"><i class=\"icon-user\"></i><br />Espace ENSEIGNANT</a>
                                ";
            }
            // line 103
            echo "
                                <a href=\"";
            // line 104
            echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("fos_user_security_logout");
            echo "\"><i class=\"icon-user\"></i><br />Logout</a>
                            ";
        } else {
            // line 106
            echo "                                <a href=\"";
            echo $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("fos_user_security_login");
            echo "\"><i class=\"icon-user\"></i><br />Login</a>
                            ";
        }
        // line 108
        echo "                            </li>
                        </ul></div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Page Title -->
<div class=\"page-title\">
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"span12\">
                <i class=\"icon-tasks page-title-icon\"></i>
                <h2>Services /</h2>
                <p>Here are the services we offer</p>
            </div>
        </div>
    </div>
</div>

";
        // line 129
        $this->displayBlock('body', $context, $blocks);
        // line 131
        echo "<!-- Footer -->
<footer>
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"widget span3\">
                <h4>About Us</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                <p><a href=\"\">Read more...</a></p>
            </div>
            <div class=\"widget span3\">
                <h4>Latest Tweets</h4>
                <div class=\"show-tweets\"></div>
            </div>
            <div class=\"widget span3\">
                <h4>Flickr Photos</h4>
                <ul class=\"flickr-feed\"></ul>
            </div>
            <div class=\"widget span3\">
                <h4>Contact Us</h4>
                <p><i class=\"icon-map-marker\"></i> Address: Via Principe Amedeo 9, 10100, Torino, TO, Italy</p>
                <p><i class=\"icon-phone\"></i> Phone: 0039 333 12 68 347</p>
                <p><i class=\"icon-user\"></i> Skype: Andia_Agency</p>
                <p><i class=\"icon-envelope-alt\"></i> Email: <a href=\"\">contact@andia.co.uk</a></p>
            </div>
        </div>
        <div class=\"footer-border\"></div>
        <div class=\"row\">
            <div class=\"copyright span4\">
                <p>Copyright 2012 Andia - All rights reserved. Template by <a href=\"http://azmind.com\">Azmind</a>.</p>
            </div>
            <div class=\"social span8\">
                <a class=\"facebook\" href=\"\"></a>
                <a class=\"dribbble\" href=\"\"></a>
                <a class=\"twitter\" href=\"\"></a>
                <a class=\"pinterest\" href=\"\"></a>
            </div>
        </div>
    </div>
</footer>

<!-- Javascript -->
<script src=\"";
        // line 172
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jquery-1.8.2.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 173
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jquery-1.8.2.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 174
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jquery.flexslider.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 175
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jquery.tweet.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 176
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jflickrfeed.js"), "html", null, true);
        echo "\"></script>
<script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>
<script src=\"";
        // line 178
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jquery.ui.map.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 179
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/js/jquery.quicksand.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 180
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/prettyPhoto/js/jquery.prettyPhoto.js"), "html", null, true);
        echo "\"></script>


<script src=\"";
        // line 183
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/jquery/jquery.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 184
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/bootstrap/js/bootstrap.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 185
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/owlcarousel/owl.carousel.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 186
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/venobox/venobox.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 187
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/knob/jquery.knob.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 188
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/wow/wow.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 189
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/parallax/parallax.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 190
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/easing/easing.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 191
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/nivo-slider/js/jquery.nivo.slider.js"), "html", null, true);
        echo "\" type=\"text/javascript\"></script>
<script src=\"";
        // line 192
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/appear/jquery.appear.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 193
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/lib/isotope/isotope.pkgd.min.js"), "html", null, true);
        echo "\"></script>

<!-- Contact Form JavaScript File -->
<script src=\"";
        // line 196
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/n/contactform/contactform.js"), "html", null, true);
        echo "\"></script>


</body>

</html>

";
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 28
    public function block_nour($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "nour"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "nour"));

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    // line 129
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "base.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  422 => 129,  405 => 28,  387 => 196,  381 => 193,  377 => 192,  373 => 191,  369 => 190,  365 => 189,  361 => 188,  357 => 187,  353 => 186,  349 => 185,  345 => 184,  341 => 183,  335 => 180,  331 => 179,  327 => 178,  322 => 176,  318 => 175,  314 => 174,  310 => 173,  306 => 172,  263 => 131,  261 => 129,  238 => 108,  232 => 106,  227 => 104,  224 => 103,  218 => 101,  215 => 100,  209 => 98,  206 => 97,  204 => 96,  195 => 90,  189 => 87,  155 => 56,  149 => 53,  143 => 50,  137 => 47,  133 => 46,  129 => 45,  125 => 44,  121 => 43,  117 => 42,  111 => 39,  103 => 34,  99 => 33,  95 => 32,  91 => 31,  87 => 30,  84 => 29,  82 => 28,  72 => 21,  68 => 20,  64 => 19,  60 => 18,  56 => 17,  38 => 1,);
    }

    /** @deprecated since 1.27 (to be removed in 2.0). Use getSourceContext() instead */
    public function getSource()
    {
        @trigger_error('The '.__METHOD__.' method is deprecated since version 1.27 and will be removed in 2.0. Use getSourceContext() instead.', E_USER_DEPRECATED);

        return $this->getSourceContext()->getCode();
    }

    public function getSourceContext()
    {
        return new Source("
<!DOCTYPE html>
<html lang=\"en\">

<head>

    <meta charset=\"utf-8\">
    <title>STUDYNET - VOTRE ECOLE </title>
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
    <meta name=\"description\" content=\"\">
    <meta name=\"author\" content=\"\">

    <!-- CSS -->
    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,400\">
    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Droid+Sans\">
    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Lobster\">
    <link rel=\"stylesheet\" href=\"{{ asset('front/assets/bootstrap/css/bootstrap.min.css')}}\">
    <link rel=\"stylesheet\" href=\"{{ asset('front/assets/prettyPhoto/css/prettyPhoto.css')}}\">
    <link rel=\"stylesheet\" href=\"{{ asset('front/assets/css/flexslider.css')}}\">
    <link rel=\"stylesheet\" href=\"{{ asset('front/assets/css/font-awesome.css')}}\">
    <link rel=\"stylesheet\" href=\"{{ asset('front/assets/css/style.css')}}\">


    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>
    <![endif]-->
{% block nour %}{% endblock %}
    <!-- Favicon and touch icons -->
    <link rel=\"shortcut icon\" href=\"{{ asset('front/assets/ico/favicon.ico')}}\">
    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"{{ asset('front/assets/ico/apple-touch-icon-144-precomposed.png')}}\">
    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"{{ asset('front/assets/ico/apple-touch-icon-114-precomposed.png')}}\">
    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"{{ asset('front/assets/ico/apple-touch-icon-72-precomposed.png')}}\">
    <link rel=\"apple-touch-icon-precomposed\" href=\"{{ asset('front/assets/ico/apple-touch-icon-57-precomposed.png')}}\">

    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,400i,600,700|Raleway:300,400,400i,500,500i,700,800,900\" rel=\"stylesheet\">

    <!-- Bootstrap CSS File -->
    <link href=\"{{ asset('lib/bootstrap/css/bootstrap.min.css') }}\" rel=\"stylesheet\">

    <!-- Libraries CSS Files -->
    <link href=\"{{ asset('front/n/lib/nivo-slider/css/nivo-slider.css') }}\" rel=\"stylesheet\">
    <link href=\"{{ asset('front/n/lib/owlcarousel/owl.carousel.css') }}\" rel=\"stylesheet\">
    <link href=\"{{ asset('front/n/lib/owlcarousel/owl.transitions.css') }}\" rel=\"stylesheet\">
    <link href=\"{{ asset('front/n/lib/font-awesome/css/font-awesome.min.css') }}\" rel=\"stylesheet\">
    <link href=\"{{ asset('front/n/lib/animate/animate.min.css') }}\" rel=\"stylesheet\">
    <link href=\"{{ asset('front/n/lib/venobox/venobox.css') }}\" rel=\"stylesheet\">

    <!-- Nivo Slider Theme -->
    <link href=\"{{ asset('front/n/css/nivo-slider-theme.css') }}\" rel=\"stylesheet\">

    <!-- Main Stylesheet File -->
    <link href=\"{{ asset('front/n/css/style.css') }}\" rel=\"stylesheet\">

    <!-- Responsive Stylesheet File -->
    <link href=\"{{ asset('front/n/css/responsive.css') }}\" rel=\"stylesheet\">
</head>

<body>

<!-- Header -->
<div class=\"container\">
    <div class=\"header row\">
        <div class=\"span12\">
            <div class=\"navbar\">
                <div class=\"navbar-inner\">
                    <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                        <span class=\"icon-bar\"></span>
                    </a>
                    <h3>
                        <a class=\"brand\" href=\"index.html\">STUDYNET - a super cool SCHOOL ...</a>
                    </h3>
                    <div class=\"nav-collapse collapse\">
                        <ul class=\"nav pull-right\">
                            <li class=\"current-page\">
                                <a href=\"#\"><i class=\"icon-home\"></i><br />Home</a>
                            </li>
                            <li>
                                <a href=\"#\"><i class=\"icon-camera\"></i><br />Scolarité</a>
                            </li>
                            <li>
                                <a href=\"#\"><i class=\"icon-comments\"></i><br />Administration</a>
                            </li>
                            <li>
                                <a href=\"{{ path(\"livre_indexFront\") }}\"><i class=\"icon-tasks\"></i><br />Bibliothéque</a>
                            </li>
                            <li>
                                <a href=\"{{ path(\"front_list\") }}\"><i class=\"icon-user\"></i><br />Evénements</a>
                            </li>
                            <li>
                                <a href=\"#\"><i class=\"icon-user\"></i><br />Cours et Quizz</a>
                            </li>
                            <li>
                            {% if is_granted(\"IS_AUTHENTICATED_REMEMBERED\") %}
                                {% if is_granted('ROLE_ADMIN') %}
                                    <a href=\"{{ path('categorie_new') }}\"><i class=\"icon-user\"></i><br />Espace Admin</a>
                                {% endif %}
                                {% if is_granted('ROLE_ENSEIGNANT') %}
                                    <a href=\"{{ path('categorie_new') }}\"><i class=\"icon-user\"></i><br />Espace ENSEIGNANT</a>
                                {% endif %}

                                <a href=\"{{ path('fos_user_security_logout') }}\"><i class=\"icon-user\"></i><br />Logout</a>
                            {% else %}
                                <a href=\"{{ path('fos_user_security_login') }}\"><i class=\"icon-user\"></i><br />Login</a>
                            {% endif %}
                            </li>
                        </ul></div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Page Title -->
<div class=\"page-title\">
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"span12\">
                <i class=\"icon-tasks page-title-icon\"></i>
                <h2>Services /</h2>
                <p>Here are the services we offer</p>
            </div>
        </div>
    </div>
</div>

{% block body %}
{% endblock %}
<!-- Footer -->
<footer>
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"widget span3\">
                <h4>About Us</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et.</p>
                <p><a href=\"\">Read more...</a></p>
            </div>
            <div class=\"widget span3\">
                <h4>Latest Tweets</h4>
                <div class=\"show-tweets\"></div>
            </div>
            <div class=\"widget span3\">
                <h4>Flickr Photos</h4>
                <ul class=\"flickr-feed\"></ul>
            </div>
            <div class=\"widget span3\">
                <h4>Contact Us</h4>
                <p><i class=\"icon-map-marker\"></i> Address: Via Principe Amedeo 9, 10100, Torino, TO, Italy</p>
                <p><i class=\"icon-phone\"></i> Phone: 0039 333 12 68 347</p>
                <p><i class=\"icon-user\"></i> Skype: Andia_Agency</p>
                <p><i class=\"icon-envelope-alt\"></i> Email: <a href=\"\">contact@andia.co.uk</a></p>
            </div>
        </div>
        <div class=\"footer-border\"></div>
        <div class=\"row\">
            <div class=\"copyright span4\">
                <p>Copyright 2012 Andia - All rights reserved. Template by <a href=\"http://azmind.com\">Azmind</a>.</p>
            </div>
            <div class=\"social span8\">
                <a class=\"facebook\" href=\"\"></a>
                <a class=\"dribbble\" href=\"\"></a>
                <a class=\"twitter\" href=\"\"></a>
                <a class=\"pinterest\" href=\"\"></a>
            </div>
        </div>
    </div>
</footer>

<!-- Javascript -->
<script src=\"{{ asset('front/assets/js/jquery-1.8.2.min.js')}}\"></script>
<script src=\"{{ asset('front/assets/js/jquery-1.8.2.min.js')}}\"></script>
<script src=\"{{ asset('front/assets/js/jquery.flexslider.js')}}\"></script>
<script src=\"{{ asset('front/assets/js/jquery.tweet.js')}}\"></script>
<script src=\"{{ asset('front/assets/js/jflickrfeed.js')}}\"></script>
<script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>
<script src=\"{{ asset('front/assets/js/jquery.ui.map.min.js')}}\"></script>
<script src=\"{{ asset('front/assets/js/jquery.quicksand.js')}}\"></script>
<script src=\"{{ asset('front/assets/prettyPhoto/js/jquery.prettyPhoto.js')}}\"></script>


<script src=\"{{ asset('front/n/lib/jquery/jquery.min.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/bootstrap/js/bootstrap.min.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/owlcarousel/owl.carousel.min.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/venobox/venobox.min.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/knob/jquery.knob.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/wow/wow.min.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/parallax/parallax.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/easing/easing.min.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/nivo-slider/js/jquery.nivo.slider.js')}}\" type=\"text/javascript\"></script>
<script src=\"{{ asset('front/n/lib/appear/jquery.appear.js')}}\"></script>
<script src=\"{{ asset('front/n/lib/isotope/isotope.pkgd.min.js')}}\"></script>

<!-- Contact Form JavaScript File -->
<script src=\"{{ asset('front/n/contactform/contactform.js')}}\"></script>


</body>

</html>

", "base.html.twig", "C:\\wamp64\\www\\Lite\\app\\Resources\\views\\base.html.twig");
    }
}
