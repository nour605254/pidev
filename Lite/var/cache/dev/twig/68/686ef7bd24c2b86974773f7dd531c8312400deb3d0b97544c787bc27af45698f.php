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

/* @Event/Event/list.html.twig */
class __TwigTemplate_c7c491500579848bab97bcbf6bcebaa9f68d9502eed519e07bc3e8709eae31b3 extends \Twig\Template
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
        // line 2
        return "baseAdmin.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/list.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "@Event/Event/list.html.twig"));

        $this->parent = $this->loadTemplate("baseAdmin.html.twig", "@Event/Event/list.html.twig", 2);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 3
    public function block_body($context, array $blocks = [])
    {
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->env->getExtension("Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension");
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->env->getExtension("Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension");
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 4
        echo "


                        <table id=\"example1\" class=\"table table-bordered table-striped\">
                            <head>
                            <tr>
                                <th>Id</th>
                                <th>Titre</th>
                                <th>Datedebut</th>
                                <th>Datefin</th>
                                <th>Image</th>
                                <th>Adresse</th>
                                <th>Type</th>
                                <th>Nb</th>
                                <th>Description</th>
                                <th></th>
                            </tr>
                            </head>
                            <h1>Events list</h1>

                            <body>
                            ";
        // line 25
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable(($context["events"] ?? $this->getContext($context, "events")));
        foreach ($context['_seq'] as $context["_key"] => $context["event"]) {
            // line 26
            echo "                                <tr>
                                    <td>";
            // line 27
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "idevent", []), "html", null, true);
            echo "</td>
                                    <td>";
            // line 28
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "titre", []), "html", null, true);
            echo "</td>
                                    <td>";
            // line 29
            if ($this->getAttribute($context["event"], "dateDebut", [])) {
                echo twig_escape_filter($this->env, twig_date_format_filter($this->env, $this->getAttribute($context["event"], "dateDebut", []), "Y-m-d H:i:s"), "html", null, true);
            }
            echo "</td>
                                    <td>";
            // line 30
            if ($this->getAttribute($context["event"], "dateFin", [])) {
                echo twig_escape_filter($this->env, twig_date_format_filter($this->env, $this->getAttribute($context["event"], "dateFin", []), "Y-m-d H:i:s"), "html", null, true);
            }
            echo "</td>
                                    <td>";
            // line 31
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "image", []), "html", null, true);
            echo "</td>

                                    <td>";
            // line 33
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "adresseEvent", []), "html", null, true);
            echo "</td>
                                    <td>";
            // line 34
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "typeEvent", []), "html", null, true);
            echo "</td>
                                    <td>";
            // line 35
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "NbP", []), "html", null, true);
            echo "</td>
                                    <td>";
            // line 36
            echo twig_escape_filter($this->env, $this->getAttribute($context["event"], "description", []), "html", null, true);
            echo "</td>
                                    <td>
                                    <a href=\"";
            // line 38
            echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("edit", ["id" => $this->getAttribute($context["event"], "idevent", [])]), "html", null, true);
            echo "\"><i class=\"fa fa-edit\" style=\"font-size:18px\"></i></a>
                                        <a href=\"";
            // line 39
            echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("event_delete", ["id" => $this->getAttribute($context["event"], "idevent", [])]), "html", null, true);
            echo "\"><i class=\"fa fa-trash\" style=\"font-size:18px\"></i></a>
                                        <a href=\"";
            // line 40
            echo twig_escape_filter($this->env, $this->env->getExtension('Symfony\Bridge\Twig\Extension\RoutingExtension')->getPath("event_show", ["id" => $this->getAttribute($context["event"], "idevent", [])]), "html", null, true);
            echo "\"><i class=\"fa fa-eye\" style=\"font-size:18px\"></i></a>

                                    </td>
                                </tr>

                            ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['event'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 46
        echo "                            </body>


                        </table>

                        ";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "@Event/Event/list.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  152 => 46,  140 => 40,  136 => 39,  132 => 38,  127 => 36,  123 => 35,  119 => 34,  115 => 33,  110 => 31,  104 => 30,  98 => 29,  94 => 28,  90 => 27,  87 => 26,  83 => 25,  60 => 4,  51 => 3,  29 => 2,);
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
{% extends 'baseAdmin.html.twig' %}
{% block body %}



                        <table id=\"example1\" class=\"table table-bordered table-striped\">
                            <head>
                            <tr>
                                <th>Id</th>
                                <th>Titre</th>
                                <th>Datedebut</th>
                                <th>Datefin</th>
                                <th>Image</th>
                                <th>Adresse</th>
                                <th>Type</th>
                                <th>Nb</th>
                                <th>Description</th>
                                <th></th>
                            </tr>
                            </head>
                            <h1>Events list</h1>

                            <body>
                            {% for event in events %}
                                <tr>
                                    <td>{{ event.idevent }}</td>
                                    <td>{{ event.titre }}</td>
                                    <td>{% if event.dateDebut %}{{ event.dateDebut|date('Y-m-d H:i:s') }}{% endif %}</td>
                                    <td>{% if event.dateFin %}{{ event.dateFin|date('Y-m-d H:i:s') }}{% endif %}</td>
                                    <td>{{ event.image }}</td>

                                    <td>{{ event.adresseEvent }}</td>
                                    <td>{{ event.typeEvent }}</td>
                                    <td>{{ event.NbP }}</td>
                                    <td>{{ event.description }}</td>
                                    <td>
                                    <a href=\"{{ path('edit', { 'id': event.idevent }) }}\"><i class=\"fa fa-edit\" style=\"font-size:18px\"></i></a>
                                        <a href=\"{{ path('event_delete', { 'id': event.idevent }) }}\"><i class=\"fa fa-trash\" style=\"font-size:18px\"></i></a>
                                        <a href=\"{{ path('event_show', { 'id': event.idevent }) }}\"><i class=\"fa fa-eye\" style=\"font-size:18px\"></i></a>

                                    </td>
                                </tr>

                            {% endfor %}
                            </body>


                        </table>

                        {% endblock %}
", "@Event/Event/list.html.twig", "C:\\wamp64\\www\\Lite1\\src\\EventBundle\\Resources\\views\\Event\\list.html.twig");
    }
}
