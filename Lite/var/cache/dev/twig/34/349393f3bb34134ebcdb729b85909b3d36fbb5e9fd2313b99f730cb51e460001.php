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

/* @Event/Event/accept.html.twig */
class __TwigTemplate_bc8bcbc8aebc23b38f1379de56f50204b06357993aa93cc0b261291b489d2abb extends \Twig\Template
{
    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->blocks = [
            'nour' => [$this, 'block_nour'],
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doGetParent(array $context)
    {
        // line 1
        return "base.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/accept.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/accept.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "@Event/Event/accept.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 2
    public function block_nour($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "nour"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "nour"));

        // line 3
        echo "
    <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>
    <link rel=\"stylesheet\" href=\"";
        // line 5
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl("front/assets/css/stylenour.css"), "html", null, true);
        echo "\">
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    // line 8
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 9
        echo "    <br><br>
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"[ col-xs-12 col-sm-offset-2 col-sm-8 ]\">
                <ul class=\"event-list\">



                                                <h1> votre particpation a été bien effectuée </h1></li></li>
                <br>
                    <br>
                    <br>
                <lu><center><br><center>
                        <a onClick=\"onclick\">S'intéresser</a>
                        <a onClick=\"onclick\">Annuler</a></center>
                    </li></lu>


                </ul>
            </div>

    </div>

    <script>
        (function(){

            var popupCenter = function(url, title, width, height){
                var popupWidth = width || 640;
                var popupHeight = height || 320;
                var windowLeft = window.screenLeft || window.screenX;
                var windowTop = window.screenTop || window.screenY;
                var windowWidth = window.innerWidth || document.documentElement.clientWidth;
                var windowHeight = window.innerHeight || document.documentElement.clientHeight;
                var popupLeft = windowLeft + windowWidth / 2 - popupWidth / 2 ;
                var popupTop = windowTop + windowHeight / 2 - popupHeight / 2;
                var popup = window.open(url, title, 'scrollbars=yes, width=' + popupWidth + ', height=' + popupHeight + ', top=' + popupTop + ', left=' + popupLeft);
                popup.focus();
                return true;
            };

            document.querySelector('.share_twitter').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://twitter.com/intent/tweet?text=\" + encodeURIComponent(document.title) +
                    \"&via=studynet\" +
                    \"&url=\" + encodeURIComponent(url);
                popupCenter(shareUrl, \"Partager sur Twitter\");
            });

            document.querySelector('.share_facebook').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://www.facebook.com/sharer/sharer.php?u=\" + encodeURIComponent(url) + \"&via=studynet\";
                popupCenter(shareUrl, \"Partager sur facebook\");
            });

            document.querySelector('.share_gplus').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://plus.google.com/share?url=\" + encodeURIComponent(url) ;
                popupCenter(shareUrl, \"Partager sur Google+\");
            });

            document.querySelector('.share_linkedin').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://www.linkedin.com/shareArticle?url=\" + encodeURIComponent(url);
                popupCenter(shareUrl, \"Partager sur Linkedin\");
            });

        })();
    </script>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "@Event/Event/accept.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  86 => 9,  77 => 8,  65 => 5,  61 => 3,  52 => 2,  30 => 1,);
    }

    /** @deprecated since 1.27 (to be removed in 2.0). Use getSourceContext() instead */
    public function getSource()
    {
        @trigger_error('The '.__METHOD__.' method is deprecated since version 1.27 and will be removed in 2.0. Use getSourceContext() instead.', E_USER_DEPRECATED);

        return $this->getSourceContext()->getCode();
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}
{% block nour %}

    <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>
    <link rel=\"stylesheet\" href=\"{{ asset('front/assets/css/stylenour.css')}}\">
{% endblock %}

{% block body %}
    <br><br>
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"[ col-xs-12 col-sm-offset-2 col-sm-8 ]\">
                <ul class=\"event-list\">



                                                <h1> votre particpation a été bien effectuée </h1></li></li>
                <br>
                    <br>
                    <br>
                <lu><center><br><center>
                        <a onClick=\"onclick\">S'intéresser</a>
                        <a onClick=\"onclick\">Annuler</a></center>
                    </li></lu>


                </ul>
            </div>

    </div>

    <script>
        (function(){

            var popupCenter = function(url, title, width, height){
                var popupWidth = width || 640;
                var popupHeight = height || 320;
                var windowLeft = window.screenLeft || window.screenX;
                var windowTop = window.screenTop || window.screenY;
                var windowWidth = window.innerWidth || document.documentElement.clientWidth;
                var windowHeight = window.innerHeight || document.documentElement.clientHeight;
                var popupLeft = windowLeft + windowWidth / 2 - popupWidth / 2 ;
                var popupTop = windowTop + windowHeight / 2 - popupHeight / 2;
                var popup = window.open(url, title, 'scrollbars=yes, width=' + popupWidth + ', height=' + popupHeight + ', top=' + popupTop + ', left=' + popupLeft);
                popup.focus();
                return true;
            };

            document.querySelector('.share_twitter').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://twitter.com/intent/tweet?text=\" + encodeURIComponent(document.title) +
                    \"&via=studynet\" +
                    \"&url=\" + encodeURIComponent(url);
                popupCenter(shareUrl, \"Partager sur Twitter\");
            });

            document.querySelector('.share_facebook').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://www.facebook.com/sharer/sharer.php?u=\" + encodeURIComponent(url) + \"&via=studynet\";
                popupCenter(shareUrl, \"Partager sur facebook\");
            });

            document.querySelector('.share_gplus').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://plus.google.com/share?url=\" + encodeURIComponent(url) ;
                popupCenter(shareUrl, \"Partager sur Google+\");
            });

            document.querySelector('.share_linkedin').addEventListener('click', function(e){
                e.preventDefault();
                var url = this.getAttribute('data-url');
                var shareUrl = \"https://www.linkedin.com/shareArticle?url=\" + encodeURIComponent(url);
                popupCenter(shareUrl, \"Partager sur Linkedin\");
            });

        })();
    </script>
{% endblock %}", "@Event/Event/accept.html.twig", "C:\\wamp64\\www\\Lite\\src\\EventBundle\\Resources\\views\\Event\\accept.html.twig");
    }
}
