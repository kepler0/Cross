require 'java'

java_package 'k2b6s9j.cross'

java_import 'cpw.mods.fml.common.Mod'
java_import 'cpw.mods.fml.common.event.FMLPreInitializationEvent'
java_import 'cpw.mods.fml.common.event.FMLInitializationEvent'
java_import 'cpw.mods.fml.common.event.FMLPostInitializationEvent'

java_annotation 'Mod(modid = "Cross", name = "Cross", version = "1.0")'
class Cross

  java_annotation 'Mod.EventHandler'
  java_signature 'void preInit(FMLPreInitializationEvent)'
  def preInit(event)

    printCopyrightInfo

  end

  def printCopyrightInfo
    puts 'Cross'
    puts 'Copyright Kepler Sticka-Jones 2014'
    puts 'https://github.com/k2b6s9j/Cross'
  end

  java_annotation 'Mod.EventHandler'
  java_signature 'void init(FMLInitializationEvent)'
  def init(event)
  end

  java_annotation 'Mod.EventHandler'
  java_signature 'void postInit(FMLPostInitializationEvent)'
  def postInit(event)
  end
end
