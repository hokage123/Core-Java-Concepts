//packages print
class Anki445
{
public static void main(String[] j)
{
Package pkgs[];
pkgs=Package.getPackages();
for(int i=0;i<pkgs.length;i++)
System.out.println(pkgs[i].getName()+"	"+pkgs[i].getImplementationTitle()+"	"+pkgs[i].getImplementationVendor()+"	"+pkgs[i].getImplementationVersion());
}
}