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

/* @Event/Event/event_show.html.twig */
class __TwigTemplate_b606992de837d21d36e1da95f211e89099f45a6dd2f4b18eba6d796352b3ff7f extends \Twig\Template
{
    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->blocks = [
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doGetParent(array $context)
    {
        // line 1
        return "baseAdmin.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/event_show.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/event_show.html.twig"));

        $this->parent = $this->loadTemplate("baseAdmin.html.twig", "@Event/Event/event_show.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 2
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 3
        echo "        <div class=\"card\">
            <div class=\"container-fliud\">
                <div class=\"wrapper row\">
                    <div class=\"preview col-md-6\">

                        <div class=\"preview-pic tab-content\">
                            <div class=\"tab-pane active\" id=\"pic-1\"><img src=\"";
        // line 9
        echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\AssetExtension')->getAssetUrl(("uploads/images/Event/" . $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "image", []))), "html", null, true);
        echo "\" height=\"100px\" width=\"250px\"></div>
                               ";
        // line 12
        echo "
                        </div>


                    </div>
                    <div class=\"details col-md-6\">
                        <h4 class=\"product-title\">";
        // line 18
        echo twig_escape_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "titre", []), "html", null, true);
        echo "</h4>
                        <h5 class=\"price\">Idantifiant : <span>";
        // line 19
        echo twig_escape_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "idevent", []), "html", null, true);
        echo "</span></h5>
                        <h5 class=\"price\">Type: <span>";
        // line 20
        echo twig_escape_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "typeEvent", []), "html", null, true);
        echo "</span></h5>
                        <h5 class=\"price\">Nombre de participant: <span>";
        // line 21
        echo twig_escape_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "adresseEvent", []), "html", null, true);
        echo "</span></h5>
                        <h5 class=\"price\">Date de debut: <span>";
        // line 22
        echo twig_escape_filter($this->env, twig_date_format_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "dateDebutEvent", [])), "html", null, true);
        echo "</span></h5>
                        <h5 class=\"price\">Date de fin: <span>";
        // line 23
        echo twig_escape_filter($this->env, twig_date_format_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "dateFEvent", [])), "html", null, true);
        echo "</span></h5>
                        <p class=\"product-description\"> ";
        // line 24
        echo twig_escape_filter($this->env, $this->getAttribute(($context["event"] ?? $this->getContext($context, "event")), "description", []), "html", null, true);
        echo "</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
    </html>

";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "@Event/Event/event_show.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  104 => 24,  100 => 23,  96 => 22,  92 => 21,  88 => 20,  84 => 19,  80 => 18,  72 => 12,  68 => 9,  60 => 3,  51 => 2,  29 => 1,);
    }

    /** @deprecated since 1.27 (to be removed in 2.0). Use getSourceContext() instead */
    public function getSource()
    {
        @trigger_error('The '.__METHOD__.' method is deprecated since version 1.27 and will be removed in 2.0. Use getSourceContext() instead.', E_USER_DEPRECATED);

        return $this->getSourceContext()->getCode();
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'baseAdmin.html.twig' %}
{% block body %}
        <div class=\"card\">
            <div class=\"container-fliud\">
                <div class=\"wrapper row\">
                    <div class=\"preview col-md-6\">

                        <div class=\"preview-pic tab-content\">
                            <div class=\"tab-pane active\" id=\"pic-1\"><img src=\"{{ asset('uploads/images/Event/' ~ event.image) }}\" height=\"100px\" width=\"250px\"></div>
                               {#img src=\"http://placekitten.com/400/252\" />
                        // /div>#}

                        </div>


                    </div>
                    <div class=\"details col-md-6\">
                        <h4 class=\"product-title\">{{ event.titre }}</h4>
                        <h5 class=\"price\">Idantifiant : <span>{{ event.idevent }}</span></h5>
                        <h5 class=\"price\">Type: <span>{{ event.typeEvent }}</span></h5>
                        <h5 class=\"price\">Nombre de participant: <span>{{ event.adresseEvent }}</span></h5>
                        <h5 class=\"price\">Date de debut: <span>{{ event.dateDebutEvent | date}}</span></h5>
                        <h5 class=\"price\">Date de fin: <span>{{ event.dateFEvent | date }}</span></h5>
                        <p class=\"product-description\"> {{ event.description }}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
    </html>

{% endblock %}", "@Event/Event/event_show.html.twig", "C:\\wamp64\\www\\Lite1\\src\\EventBundle\\Resources\\views\\Event\\event_show.html.twig");
    }
}
