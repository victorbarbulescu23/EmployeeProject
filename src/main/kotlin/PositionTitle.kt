enum class PositionTitle {
    ADMINISTRATION{
       override fun returnString():String{
           return "Administration"
       }
    },
    PRODUCTION{
        override fun returnString():String{
            return "Production"
        }
    },
    SALES{
        override fun returnString():String{
            return "Sales"
        }
    },
    MAINTENANCE{
        override fun returnString():String{
            return "Maintenance"
        }
    },
    TECHNICAL{
        override fun returnString():String{
            return "Technical"
        }
    },
    SECRETARIAL{
        override fun returnString():String{
            return "Secretarial"
        }
    };

    abstract fun returnString(): String
}