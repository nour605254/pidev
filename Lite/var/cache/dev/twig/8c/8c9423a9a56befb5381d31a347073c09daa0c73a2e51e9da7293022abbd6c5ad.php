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

/* @Event/Event/front_list.html.twig */
class __TwigTemplate_1fa13991d3adb3fdccf29279dd6dbbccea2561eb898b430fc70826fb1b8396e5 extends \Twig\Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/front_list.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/front_list.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "@Event/Event/front_list.html.twig", 1);
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


";
        // line 16
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable(($context["events"] ?? $this->getContext($context, "events")));
        foreach ($context['_seq'] as $context["_key"] => $context["event"]) {
            // line 17
            echo "    ";
            $context["currentDate"] = twig_date_format_filter($this->env, "now", "d - m - Y");
            // line 18
            echo "    ";
            if (($this->getAttribute($context["event"], "dateFEvent", []) > ($context["currentDate"] ?? $this->getContext($context, "currentDate")))) {
                // line 19
                echo "                    <li>
                        ";
                // line 20
                $context["dateTime"] = twig_date_converter($this->env, $this->getAttribute($context["event"], "dateDebutEvent", []));
                // line 21
                echo "                        <time datetime=\"\">
                            <span class=\"day\">";
                // line 22
                echo twig_escape_filter($this->env, twig_date_format_filter($this->env, ($context["dateTime"] ?? $this->getContext($context, "dateTime")), "d"), "html", null, true);
                echo "</span>
                            <span class=\"month\">";
                // line 23
                echo twig_escape_filter($this->env, twig_date_format_filter($this->env, ($context["dateTime"] ?? $this->getContext($context, "dateTime")), "m"), "html", null, true);
                echo "</span>
                            <span class=\"year\">";
                // line 24
                echo twig_escape_filter($this->env, twig_date_format_filter($this->env, ($context["dateTime"] ?? $this->getContext($context, "dateTime")), "y"), "html", null, true);
                echo "</span>
                        </time>
                        <img alt=\"event\" src=\"";
                // line 26
                echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl(("uploads/images/Event/" . $this->getAttribute($context["event"], "image", []))), "html", null, true);
                echo "\" />
                        <div class=\"info\">
                            <h2 class=\"title\">";
                // line 28
                echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "titre", []), "html", null, true);
                echo "</h2>
                            <p class=\"desc\">";
                // line 29
                echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "description", []), "html", null, true);
                echo "</p>
                            <ul>
                                <li style=\"width:33%;\">";
                // line 31
                echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "NbP", []), "html", null, true);
                echo " <span class=\"fa fa-male\"></span></li>
                                <li style=\"width:34%;\"><form>


                                    <a href=\"";
                // line 35
                echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("accept", ["id" => $this->getAttribute($context["event"], "idevent", [])]), "html", null, true);
                echo "\"onClick=\"onclick\">Participer</a>
                                   ";
                // line 37
                echo "                                    <a href=\"";
                echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("Annuler", ["id" => $this->getAttribute($context["event"], "idevent", [])]), "html", null, true);
                echo "\" onClick=\"onclick\">Annuler</a>
                                </li>
                                <li style=\"width:33%;\">

                                <div class=\"social\">
                                    <ul>
                                        <li ><a href=\"";
                // line 43
                echo $this->env->getExtension('Nomaya\SocialBundle\Twig\Extension\NomayaTwigSocialBar')->getSocialButtons();
                echo "\"></a></li>


                                        <li class=\"google-plus\" style=\"width:33%;\"><a class=\"button share_gplus\" data-url=\"https://www.youtube.com\"><span class=\"fa fa-google-plus\"></span></a></li>
                                    </ul>
                                </div>
                                </li>

                            </ul>
                        </div>


                    </li>
    ";
            }
            // line 57
            echo "                    ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['event'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 58
        echo "
                </ul>
            </div>
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
        return "@Event/Event/front_list.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  184 => 58,  178 => 57,  161 => 43,  151 => 37,  147 => 35,  140 => 31,  135 => 29,  131 => 28,  126 => 26,  121 => 24,  117 => 23,  113 => 22,  110 => 21,  108 => 20,  105 => 19,  102 => 18,  99 => 17,  95 => 16,  86 => 9,  77 => 8,  65 => 5,  61 => 3,  52 => 2,  30 => 1,);
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


{% for event in events %}
    {% set currentDate = 'now'| date ('d - m - Y') %}
    {% if event.dateFEvent > currentDate %}
                    <li>
                        {% set dateTime = date(event.dateDebutEvent) %}
                        <time datetime=\"\">
                            <span class=\"day\">{{ dateTime | date('d') }}</span>
                            <span class=\"month\">{{ dateTime | date('m') }}</span>
                            <span class=\"year\">{{ dateTime | date('y') }}</span>
                        </time>
                        <img alt=\"event\" src=\"{{ asset('uploads/images/Event/' ~ event.image) }}\" />
                        <div class=\"info\">
                            <h2 class=\"title\">{{ event.titre }}</h2>
                            <p class=\"desc\">{{ event.description }}</p>
                            <ul>
                                <li style=\"width:33%;\">{{ event.NbP}} <span class=\"fa fa-male\"></span></li>
                                <li style=\"width:34%;\"><form>


                                    <a href=\"{{ path('accept',{'id':event.idevent}) }}\"onClick=\"onclick\">Participer</a>
                                   {#<a onClick=\"onclick\">S'intéresser</a>#}
                                    <a href=\"{{ path('Annuler',{'id':event.idevent}) }}\" onClick=\"onclick\">Annuler</a>
                                </li>
                                <li style=\"width:33%;\">

                                <div class=\"social\">
                                    <ul>
                                        <li ><a href=\"{{ socialButtons() }}\"></a></li>


                                        <li class=\"google-plus\" style=\"width:33%;\"><a class=\"button share_gplus\" data-url=\"https://www.youtube.com\"><span class=\"fa fa-google-plus\"></span></a></li>
                                    </ul>
                                </div>
                                </li>

                            </ul>
                        </div>


                    </li>
    {% endif %}
                    {% endfor %}

                </ul>
            </div>
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
{% endblock %}", "@Event/Event/front_list.html.twig", "C:\\wamp64\\www\\Lite1\\src\\EventBundle\\Resources\\views\\Event\\front_list.html.twig");
    }
}
