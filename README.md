***

<p>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="https://github.com/GII/UNIDA">Home</a> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; || &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="https://github.com/GII/UNIDA/wiki">Documentation</a> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; || &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
Downloads 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; || &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
<a href="https://github.com/GII/UNIDA/tree/master/devel">Sources</a> 
</p>

***

### UniDA Framework


The UniDA Framework provides an integral solution for building systems that require the integration and interoperation of multiple devices and hardware technologies, like building automation systems, ubiquitous computing systems or ambient intelligence systems.

UniDA is designed to make easier the development of systems that use hardware devices to operate in Human Interaction Environments (HIE). HIEs must be understood as any place where people carry out their daily life, including their work, family life, leisure and social life, interacting with technology to enhance or facilitate the experience. The integration of technology in these environments has been achieved in a disorderly and incompatible way, with devices operating in isolated islands with artificial edges delimited by the manufacturers. UniDA provides developers and installers with a uniform conceptual framework capable of modelling an HIE, together with a set of libraries, tools and devices to build distributed instrumentation networks with support for transparent integration of other technologies.

It is possible to use UniDA for two different, but interrelated, purposes. As an abstraction layer it allows the development of applications that handle hardware devices with independence of the technologies used in each device and their particular characteristics. As a complete HIE instrumentation solution it permits building distributed device networks with support for the transparent integration of existing installations and technologies.

In the first case, the applications have a heterogeneous vision of the network of devices; they must include particular logic to interact with each specific technology and device available in the network, thus complicating the development process and making the addition of new devices more difficult, as they need to take care of all the complexities and particularities of each hardware technology deployed in the installation. In the second case, the applications have a homogeneous vision of the network, they are able to use the same concepts and operations to interact with every device, independently of their underlying technologies. This way they do not require knowledge of specific technologies, they can use devicesfrom different technologies homogeneously, and new devices can be easily added to the network without requiring any modification of the application logic. 

The paper [UniDA: Uniform Device Access Framework for Human Interaction Environments](http://www.mdpi.com/1424-8220/11/10/9361) provides a good overview of UniDA and how it can be used to build HIEs and applications that exploit the capabilities of multiple distributed hardware devices.

A detailed documentation of the UniDA Framework is available in this project <a href="https://github.com/GII/UNIDA/wiki">Wiki</a>.
